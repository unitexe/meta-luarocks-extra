SUMMARY = "A collection of LPEG patterns "
HOMEPAGE = "https://github.com/daurnimator/lpeg_patterns"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d6826f09b61003ecaae3057e5d17061d"

SRC_URI = "git://github.com/daurnimator/lpeg_patterns;branch=master;protocol=https"
SRCREV = "15f4d1320770e3ef51d6a951de6e326965866fa7"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "lpeg_patterns-0.5-0.rockspec"

inherit luarocks
