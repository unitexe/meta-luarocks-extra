SUMMARY = "Most comprehensive OpenSSL module in the Lua universe."
HOMEPAGE = "http://25thandclement.com/~william/projects/luaossl.html"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb0ac1f36f0115a4484099dbf2f9fd7a"

SRC_URI = "git://github.com/wahern/luaossl;branch=master;protocol=https"
SRCREV = "8e9622c22f76d550594212c8bf5057f39d76f383"

SRC_URI:append = " file://luaossl-20220711-0.rockspec"

DEPENDS += "openssl"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "${WORKDIR}/luaossl-20220711-0.rockspec"

S = "${WORKDIR}/git"

inherit luarocks
