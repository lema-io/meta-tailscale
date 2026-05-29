require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "b456106adb12b2392dd3ed5264a10ec319ff4f36c3ad18d5e289c8e84489172c"
SRC_URI[amd64.sha256sum]     = "e6c08a8ee7e63e69aaf1b62ecd12672b3883fbcd2a176bf6cfa42a15fdce0b6b"
SRC_URI[arm.sha256sum]       = "18d4568fe5c72ac31fdac4a8af233770a0357673e6a32f315d04eb0453f495bd"
SRC_URI[arm64.sha256sum]     = "3cb068eb1368b6bb218d0ef0aa0a7a679a7156b7c979e2279cc2c2321b5f05c7"
