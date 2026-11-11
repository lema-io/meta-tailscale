require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "de7fc5087d62db8c85c4de40a3dd61bc3b80274ee50b69797b406fcf130a8e29"
SRC_URI[amd64.sha256sum]     = "82a85429f733e52fd1a95dedb2c8dd8cd46d6603504e566a56b1779c9a7a4809"
SRC_URI[arm.sha256sum]       = "98be19a248544f0d7809b71c2b6c3d1cb200aa347d3d0a47d9034dec5a26fc69"
SRC_URI[arm64.sha256sum]     = "d0e4f297da3c428d02162c6235b9948e4ddc245c64502b7b05647da9b96a0971"
