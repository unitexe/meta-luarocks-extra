SUMMARY = "HTTP Library for Lua. Supports HTTP(S) 1.0, 1.1 and 2.0; client and server"
HOMEPAGE = "https://daurnimator.github.io/lua-http/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=90bc34e6f7927ee7306b326885998691"

SRC_URI = "git://github.com/daurnimator/lua-http;branch=master;protocol=https"
SRCREV = "8841c629cdef9d4c4f1913ddff5b806e49963071"

RDEPENDS:${PN} = "lua lua-basexx lua-binaryheap lua-bit32 lua-compat53 lua-cqueues lua-fifo lua-lpeg lua-lpeg-patterns luaossl"

S = "${WORKDIR}/git"

LUAROCKS_ROCKSPEC = "http-0.4-0.rockspec"

inherit luarocks
