SUMMARY = "Lua wrapper for the Docker Engine API "
HOMEPAGE = "https://github.com/rokf/lua-docker"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/rokf/lua-docker;branch=master;protocol=https"
SRCREV = "09084bb0e1a570949fd0537eac3c7197288ce537"

SRC_URI:append = " file://docker-0.1-0.rockspec"

RDEPENDS:${PN} = "lua lua-cjson lua-basexx lua-http"

S = "${WORKDIR}/git"

LUAROCKS_ROCKSPEC = "${WORKDIR}/docker-0.1-0.rockspec"

inherit luarocks
