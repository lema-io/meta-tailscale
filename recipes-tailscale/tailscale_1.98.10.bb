require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "9a39e5e922acffa49d038d17eade7b84e9a94b6e593c76d79490c28e80247f00"
SRC_URI[amd64.sha256sum]     = "52490ce0832b245857e2afef7426d6ae5a4b49fb391412833cc95729bd23f7de"
SRC_URI[arm.sha256sum]       = "049a9170588c464ddf082df20f0f08cc4e8140176ff02d6e1f48d468f0090fdc"
SRC_URI[arm64.sha256sum]     = "d74a84e07cb1948d9f09a23ae161417c6127e562949773705c95d0762be2809d"
