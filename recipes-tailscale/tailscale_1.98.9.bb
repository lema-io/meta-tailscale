require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "4630d5461fbf7d04af13301e92c9181c7276e709bf5eb4449a40fcef62d36af1"
SRC_URI[amd64.sha256sum]     = "11be30ad301d48f84ff52fec34f8a2f78eb3e3dee1be4e9624d19fccc8df5540"
SRC_URI[arm.sha256sum]       = "2269fd75206e438d4e56e7d8ae1f48def6a3b1c00717664c861108bdd7fa1e33"
SRC_URI[arm64.sha256sum]     = "fa554ee808d7d07ee8e3ebbc0215ea087157e2a0abbf408e6e18ea7532554db6"
