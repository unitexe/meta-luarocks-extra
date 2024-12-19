SUMMARY = "Fifo library for Lua "
HOMEPAGE = "https://github.com/daurnimator/fifo.lua"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7717acd0fc60a21abfaba2acb98bf94"

SRC_URI = "git://github.com/daurnimator/fifo.lua;branch=master;protocol=https"
SRCREV = "414b43e2a8d0ca136a1956c09c2fd43bfa1998a2"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "fifo-scm-0.rockspec"

S = "${WORKDIR}/git"

inherit luarocks
