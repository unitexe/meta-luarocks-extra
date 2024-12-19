SUMMARY = "Lua 5.2 bit manipulation library"
DESCRIPTION = " bit32 is the native Lua 5.2 bit manipulation library, in the version from Lua 5.3; it is compatible with Lua 5.1, 5.2, 5.3 and 5.4. "
HOMEPAGE = "http://www.lua.org/manual/5.2/manual.html#6.7"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=47a1db9761ff46e15d0f65fbc87d4bd5"

SRC_URI = "https://github.com/keplerproject/lua-compat-5.3/archive/v0.10.zip"
SRC_URI[sha256sum] = "9d47605c376bf68d80b29bbb308aeb49c953a870abfa299ee9f833d823eb0955"

S = "${WORKDIR}/lua-compat-5.3-0.10"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "rockspecs/bit32-5.3.5-1.rockspec"

inherit luarocks
