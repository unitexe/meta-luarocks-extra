SUMMARY = "Compatibility module providing Lua-5.3-style APIs for Lua 5.2 and 5.1"
HOMEPAGE = "https://github.com/lunarmodules/lua-compat-5.3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b863a95a5f6ff64e40a0bb54501225d0"

SRC_URI = "git://github.com/lunarmodules/lua-compat-5.3;branch=master;protocol=https"
SRCREV = "64ed183ab243cdc737203e835892b4e6cb446e46"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "rockspecs/compat53-0.14.3-1.rockspec"

S = "${WORKDIR}/git"

inherit luarocks
