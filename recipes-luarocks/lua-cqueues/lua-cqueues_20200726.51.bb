SUMMARY = "Continuation Queues: Embeddable asynchronous networking, threading, and notification framework for Lua on Unix."
DESCRIPTION = ""
HOMEPAGE = "http://25thandclement.com/~william/projects/cqueues.html"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d59d1a970000b257b5b9349f1cac6d6a"

SRC_URI = "git://github.com/wahern/cqueues;branch=master;protocol=https"
SRCREV = "b0c2bc5979f008a39300b01a0dc3e967c6257be9"

SRC_URI:append = " file://cqueues-20200726.51-0.rockspec"

DEPENDS += "openssl"

RDEPENDS:${PN} = "lua"

LUAROCKS_ROCKSPEC = "${WORKDIR}/cqueues-20200726.51-0.rockspec"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
