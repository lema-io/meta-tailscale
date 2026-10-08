require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "aa8d8421ca405a1001edab2612cf56f2a8140b08362b614a37d9e9a1dd430491"
SRC_URI[amd64.sha256sum]     = "108d1d96ecf410d305571e173516f27038f870919a9b89c914a167c6d33a4528"
SRC_URI[arm.sha256sum]       = "aea7ae225989d302444b10b44aa42e89fdfa2a691b4d124ed710b4753518a875"
SRC_URI[arm64.sha256sum]     = "f60294374967f3dfd8cf57bbbd474d6cfce32d123e3a8ddeab82a87940daa806"
