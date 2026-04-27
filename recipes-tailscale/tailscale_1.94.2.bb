require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "34f969c6dd7dd824c1395ea8efc537f9843b62b4ff1719a70e0622b8c4b31e1d"
SRC_URI[amd64.sha256sum]     = "c6f99a5d774c7783b56902188d69e9756fc3dddfb08ac6be4cb2585f3fecdc32"
SRC_URI[arm.sha256sum]       = "e5d1489c8315c88deb7d0104a9eb16a116938fff9455f8232703a1a1bf957b65"
SRC_URI[arm64.sha256sum]     = "76300e808c57eb7853090d69c8bd8806e86341862e244183f6611f9105799bba"
