require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "f79bc8df963c47854bc7f3b67a74f2611d3cafbdda7b42730539464d753badef"
SRC_URI[amd64.sha256sum]     = "a53002b0052317179d3fcace99dcd94c87b634dbb453da06b7374a4420c8160a"
SRC_URI[arm.sha256sum]       = "5bddc6e257480e239a13dabb13baecc5986dc2cefb45f7a38dda2abaa30ba784"
SRC_URI[arm64.sha256sum]     = "d26ce4a1a259621fc76d16c7baf3f3a4252f356dfa9d9769484782f766ca1b7f"
