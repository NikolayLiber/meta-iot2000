require recipes-devtools/nodejs/nodejs_7.inc
require recipes-devtools/nodejs/nodejs_lts.inc

INC_PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=270f7477a1705f7cd3e29d3d4512915d"

SRC_URI = "https://nodejs.org/dist/v${PV}/node-v${PV}.tar.gz;name=src \"
           file://0001-nodejs-add-compile-flag-options-for-quark.patch"

SRC_URI[src.md5sum] = "4ddc1daff327d7e6f63da57fdfc24f55"
SRC_URI[src.sha256sum] = "729b44b32b2f82ecd5befac4f7518de0c4e3add34e8fe878f745740a66cbbc01"
