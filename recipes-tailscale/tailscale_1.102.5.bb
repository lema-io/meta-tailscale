require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "16998e7f9942bde44299a91d5469236565b9245f0a56319fdf436fecbe9a08a8"
SRC_URI[amd64.sha256sum]     = "65e6d7f19ad7e1c87d20c2a21e92f38a96795cb897af54b04536590e1c148d12"
SRC_URI[arm.sha256sum]       = "18435a88651dc69cb762cdcbe4910b05d8b8c038604cb17e1492770a58e2feb0"
SRC_URI[arm64.sha256sum]     = "60d60109e33d097318c66adc1f1b4e78e528fa1c0357e8bfe82af99f21a18b89"
