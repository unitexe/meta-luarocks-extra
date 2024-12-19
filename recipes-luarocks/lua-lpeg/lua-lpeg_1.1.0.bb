SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a pattern-matching library for Lua, based on Parsing Expression Grammars"
HOMEPAGE = "https://www.inf.puc-rio.br/~roberto/lpeg/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=3372c43d2ceeeb9a2b61b6fe5634b7d7"

SRC_URI = "file://lpeg-${PV}.tar.gz"
SRC_URI[sha256sum] = "4b155d67d2246c1ffa7ad7bc466c1ea899bbc40fef0257cc9c03cecbaed4352a"

SRC_URI:append = " file://lpeg-${PV}-2.rockspec"

# License text copied from project website https://www.inf.puc-rio.br/~roberto/lpeg/#license
SRC_URI:append = " file://LICENSE"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "${WORKDIR}/lpeg-${PV}-2.rockspec"

S = "${WORKDIR}/lpeg-${PV}"

inherit luarocks
