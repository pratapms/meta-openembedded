SUMMARY = "Compatibility library for accessing secrets"
HOMEPAGE = "http://www.gnome.org/"
BUGTRACKER = "https://bugzilla.gnome.org/"

LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=0914b9d3ebaba41ef2e3e0ae16f296cf \
    file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
"
SECTION = "x11/gnome/libs"

inherit gnomebase gtk-doc gobject-introspection

DEPENDS = "dbus libgcrypt glib-2.0 glib-2.0-native intltool-native"

SRC_URI[archive.md5sum] = "6696e4f2e9aed4625cdc3af30bd8c238"
SRC_URI[archive.sha256sum] = "c4c178fbb05f72acc484d22ddb0568f7532c409b0a13e06513ff54b91e947783"
