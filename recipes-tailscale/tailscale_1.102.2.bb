require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "727157025552ac8fcaedddef0f2f9ec0ad4d154ea691f0d773a9107bf52df3f3"
SRC_URI[amd64.sha256sum]     = "ad2cde12f8de95f7b93a1e0401e652291c603d42b9d60a33fb1741eb38ab04d8"
SRC_URI[arm.sha256sum]       = "4d514c8659f21aa21b11c10200e25c38e1f5400d3b0c5bc17560b2f7d9c5c676"
SRC_URI[arm64.sha256sum]     = "2b64e9ade7e73034b5ec9e9bcd537f5ddd14ae3abb435e57e929e7486ae42660"
