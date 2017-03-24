SUMMARY = "Kodi Media Center"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPL;md5=930e2a5f63425d8dd72dbd7391c43c46"

BRANCH = "Krypton"
PV = "17.0"
PR = "r6"

FILESEXTRAPATHS_prepend := "${THISDIR}/kodi:"

SRC_URI = "https://github.com/xbmc/xbmc/archive/${PV}-Krypton.tar.gz \
	file://0001-configure-don-t-try-to-run-stuff-to-find-tinyxml.patch \
	file://0002-handle-SIGTERM.patch \
"

SRC_URI[md5sum] = "86ebb2f148090f12beb1e573dfd55e53"
SRC_URI[sha256sum] = "4bfffa2493973ae15ab1d922632c09a2583908d6140bc4f58ec8f9314e4f6545"

require kodi.inc
