require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "44730cacea956ffdbe145e7c1dae05668ca61febdde3ef764bba75d20c8d0b8e"
SRC_URI[amd64.sha256sum]     = "50748df1045e60b5b695f19f4c56b0da36c019948b440fb456b6584a50f0d8b9"
SRC_URI[arm.sha256sum]       = "b981a59cb85fb923ee6e1860ee6934772c83a840a6627f0dbfd7711ed690b869"
SRC_URI[arm64.sha256sum]     = "9dd1e6a592a014bbaea0103167ffe299adeda4ba14e078ce9c2895364f6c4c3f"
