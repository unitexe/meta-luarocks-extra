SUMMARY = "A base2, base16, base32, base64 and base85 library for Lua"
DESCRIPTION = "A Lua library which provides base2(bitfield), base16(hex), base32(crockford/rfc), base64(rfc/url), base85(z85) decoding and encoding."
HOMEPAGE = "https://github.com/aiq/basexx"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44eb1eb9f17513f576f511cd508ce020"

SRC_URI = "git://github.com/aiq/basexx;branch=master;protocol=https"
SRCREV = "7acfe920345df885ba89c6feb307990cfc40c614"

LUAROCKS_ROCKSPEC = "dist/basexx-0.4.1-1.rockspec"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "lua"

inherit luarocks
