require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "87f3d3932f7430d2f0a01106ce604b25b9245823ebb7a7c383ba73650e399e4a"
SRC_URI[amd64.sha256sum]     = "512f613ed7d04fc7282f7dc5bd76aa105aae28168fbb9357eb749ebcbc29f0ae"
SRC_URI[arm.sha256sum]       = "b694ff9c67235da98798b9592a0cc900bc9d1613041f77722ec9bf4ce2d215cf"
SRC_URI[arm64.sha256sum]     = "5776aaa901b5ef1916e66be5bb54b9f481cd399c9c28db123a8cab620efa237b"
