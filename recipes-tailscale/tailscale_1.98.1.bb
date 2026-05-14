require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "855d47d1c39d30019b2bdfc5ba4908942b2dfe820bacf0cd7d639ec22675ef4f"
SRC_URI[amd64.sha256sum]     = "a70f6e2f72203ea04d0e5159fdd479b68ca005c09003ea5238c41d0cd09e6680"
SRC_URI[arm.sha256sum]       = "9fcb68189f852846270c9548d1ea9becf28afccfa54bd54e44562619e7a43ceb"
SRC_URI[arm64.sha256sum]     = "bcb6de0d2e53f2745eb2ac19d1940da58e05f0816e9c306834f53607821005db"
