require tailscale.inc

# Find checksum with: wget -q0- https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "c66c097398f49088c9fdcfb4c37b9e195a135bc7315ecbe083655b76dc321c70"
SRC_URI[amd64.sha256sum]     = "a1cba18826b1f91cb25ef7f5b8259b5258339b42db7867af9269e21829ea78cc"
SRC_URI[arm.sha256sum]       = "6c8731f096147aaf9e187b39f892692fb2bd56dc2eb1fb8fd06982164f339869"
SRC_URI[arm64.sha256sum]     = "a27249bc70d7b37a68f8be7f5c4507ea5f354e592dce43cb5d4f3e742b313c3c"
