FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI_append_sh4 += "\
    file://glibc-fix-with-old-kernel.patch \
    file://sh4-trap.patch \
    file://0001-ldd-Force-correct-RTLDLIST-for-Solus.patch \
    file://110-sh-fix-gcc6.patch \
    file://0001-misc-Support-fallback-stateless-shells-path-in-absen.patch \
    file://0002-sysdeps-Add-support-for-usr-lib32-as-a-system-librar.patch \
    file://0003-elf-ldconfig-Use-a-stateless-ld.so.conf.patch \
    file://0005-fix-binutils-2-29-build.patch \
    file://fix-x64-abi.patch \
"
