# Copyright (c) 2019-2021 LG Electronics, Inc.

ROS_BUILD_DEPENDS += " \
    fmilibrary \
"

# backport https://github.com/ros/rosdistro/commit/d6f5a0ca09f6d15c4e1ae4beb85b25447355c120
SRC_URI = "git://github.com/ros2-gbp/fmilibrary_vendor-release;${ROS_BRANCH};protocol=https"
# branches were recreated, the SRCREV exists, but is included only in release/rolling/fmilibrary_vendor branch now
ROS_BRANCH = "nobranch=1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-just-depend-on-system-fmilibrary-with.patch"
