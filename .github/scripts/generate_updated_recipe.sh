#!/usr/bin/env bash

#
# usage: generate_updated_recipe.sh
#
# Check for latest Tailscale release and generate a new bitbake recipe from a 
# template if the latest release is newer than newest recipe version. If an update 
# is made, then the new version and the previous version will be available in 
# /tmp/tailscale_update_env otherwise the signal file will not be created.
#
 
set -euo pipefail
 
RECIPES_DIR="recipes-tailscale"
TEMPLATE=".github/templates/tailscale.bb.template"
BASE_URL="https://pkgs.tailscale.com/stable"

# The list of architectures here should match the architectures found in the template
ARCHS=("386" "amd64" "arm" "arm64")

#
# Resolve the latest stable version from the JSON manifest Tailscale publishes at 
# stable root
#
echo "Fetching latest Tailscale stable version..."

INDEX_JSON=$(curl -fsSL "${BASE_URL}/?mode=json")
LATEST_VERSION=$(echo "${INDEX_JSON}" | jq -r '.TarballsVersion')
 
echo "Latest version: ${LATEST_VERSION}"

#
# Determine the newest version there is a bitbake recipe for
#
CURRENT_VERSION=$(ls "${RECIPES_DIR}"/tailscale_*.bb 2>/dev/null \
  | sed -E 's|.*/tailscale_([^/]+)\.bb|\1|' \
  | sort -V \
  | tail -1)

#
# Compare versions and determine if an update needs to be made
#
if [[ -z "${CURRENT_VERSION}" ]]; then
  echo "No existing recipe found — will create one for ${LATEST_VERSION}."
elif [[ "${CURRENT_VERSION}" == "${LATEST_VERSION}" ]]; then
  echo "Already up to date (${CURRENT_VERSION}). Nothing to do."
  exit 0
else
  echo "Current version: ${CURRENT_VERSION} → updating to ${LATEST_VERSION}"
fi

#
# An update needs to be made...
#

#
# Fetch SHA256 checksums for each architecture
#
declare -A CHECKSUMS
for ARCH in "${ARCHS[@]}"; do
  URL="${BASE_URL}/tailscale_${LATEST_VERSION}_${ARCH}.tgz.sha256"
  echo "Fetching SHA256 checksum for ${ARCH}..."
  RAW=$(curl -fsSL "${URL}")
  CHECKSUM=$(echo "${RAW}" | awk '{print $1}')
  echo "  ${ARCH}: ${CHECKSUM}"
  CHECKSUMS["${ARCH}"]="${CHECKSUM}"
done

#
# Generate bitbake recipe for new version from the template, replacing checksum
# placeholders accordingly
#
NEW_RECIPE="${RECIPES_DIR}/tailscale_${LATEST_VERSION}.bb"
sed \
  -e "s/@@SHA256_386@@/${CHECKSUMS[386]}/" \
  -e "s/@@SHA256_AMD64@@/${CHECKSUMS[amd64]}/" \
  -e "s/@@SHA256_ARM@@/${CHECKSUMS[arm]}/" \
  -e "s/@@SHA256_ARM64@@/${CHECKSUMS[arm64]}/" \
  "${TEMPLATE}" > "${NEW_RECIPE}"
 
echo "Written: ${NEW_RECIPE}"
cat "${NEW_RECIPE}"
 
# Export the previous and new version so the caller can use this info
{
  echo "NEW_VERSION=${LATEST_VERSION}"
  echo "PREVIOUS_VERSION=${CURRENT_VERSION}"
} > /tmp/tailscale_update_env
