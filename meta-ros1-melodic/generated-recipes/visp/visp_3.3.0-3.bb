# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform library that allows prototyping and developing applications     using visual tracking and visual servoing technics at the heart of the     researches done by Inria Lagadic team. ViSP is able to compute control     laws that can be applied to robotic systems. It provides a set of visual     features that can be tracked using real time image processing or computer     vision algorithms. ViSP provides also simulation capabilities.      ViSP can be useful in robotics, computer vision, augmented reality     and computer animation."
AUTHOR = "Fabien Spindler <Fabien.Spindler@inria.fr>"
ROS_AUTHOR = "Thomas Moulard, Fabien Spindler"
HOMEPAGE = "http://www.ros.org/wiki/visp"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "visp"
ROS_BPN = "visp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libcoin80-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libdmtx-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libois-dev} \
    bzip2 \
    doxygen \
    jpeg \
    lapack \
    libdc1394 \
    libeigen \
    libpng \
    libx11 \
    libxml2 \
    opencv \
    v4l-utils \
    zbar \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libcoin80-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libdmtx-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libois-dev} \
    bzip2 \
    jpeg \
    lapack \
    libdc1394 \
    libeigen \
    libpng \
    libx11 \
    libxml2 \
    opencv \
    v4l-utils \
    zbar \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libcoin80-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libdmtx-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libois-dev} \
    bzip2 \
    jpeg \
    lapack \
    libdc1394 \
    libeigen \
    libpng \
    libx11 \
    libxml2 \
    opencv \
    v4l-utils \
    zbar \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/lagadic/visp-release/archive/release/melodic/visp/3.3.0-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/visp"
SRC_URI = "git://github.com/lagadic/visp-release;${ROS_BRANCH};protocol=https"
SRCREV = "f78ead3dfdfe77485503b85d8affdb0471c1057e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
