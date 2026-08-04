require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "e23f7efbb8194dcd82407884b76e6597ea008c92b332aee3a43019d55cc02475"
SRC_URI[amd64.sha256sum]     = "4eab0d2c268ec1f81dc50a5ef9805ea993fc08dc52ede5a6d8ddd44ef6f9df0f"
SRC_URI[arm.sha256sum]       = "459ee2b355883a603609744e6ddba5ef8dbf546f6e52c81269eb9640dd03fdd9"
SRC_URI[arm64.sha256sum]     = "43973827540d8a4db44b6b662037e8e75c98a2797cef1ce76d214becc48c470c"
