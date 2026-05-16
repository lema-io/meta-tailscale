require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "5f7958d7dd9b7f4cb61d33728f57757c0a4ceb0f34a8a3a4ea1720a26dc3d02d"
SRC_URI[amd64.sha256sum]     = "aae02be635e8bffbdaecefb3518344357d39d904c1bbe1e7ca95cd0cbb8ad21c"
SRC_URI[arm.sha256sum]       = "58df1d721f2bfdb4ccbd92c26e4a839473d8105d3b761bcd258cc10cda307868"
SRC_URI[arm64.sha256sum]     = "6f56441fedd4309fb949e8f257d7bd93bc157191968918b906a781fc25029ad4"
