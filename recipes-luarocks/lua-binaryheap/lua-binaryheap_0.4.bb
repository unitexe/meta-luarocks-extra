SUMMARY = "Binary heap implementation in Lua"
HOMEPAGE = "http://tieske.github.io/binaryheap.lua/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01cd545b0eacd6c35249fc523c3f8793"

SRC_URI = "git://github.com/Tieske/binaryheap.lua;branch=master;protocol=https"
SRCREV = "5527c544c01d63497ed5cdfe209436a4a72bad0f"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "lua"

inherit luarocks
