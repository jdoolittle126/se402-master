# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.19

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "E:\Programs\Software\JetBrains Toolbox\apps\CLion\ch-0\211.7628.27\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "E:\Programs\Software\JetBrains Toolbox\apps\CLion\ch-0\211.7628.27\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = P:\se402-master\alg-sandbox\alg-test-cpp

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/alg_test.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/alg_test.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/alg_test.dir/flags.make

CMakeFiles/alg_test.dir/main.cpp.obj: CMakeFiles/alg_test.dir/flags.make
CMakeFiles/alg_test.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/alg_test.dir/main.cpp.obj"
	E:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\alg_test.dir\main.cpp.obj -c P:\se402-master\alg-sandbox\alg-test-cpp\main.cpp

CMakeFiles/alg_test.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/alg_test.dir/main.cpp.i"
	E:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E P:\se402-master\alg-sandbox\alg-test-cpp\main.cpp > CMakeFiles\alg_test.dir\main.cpp.i

CMakeFiles/alg_test.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/alg_test.dir/main.cpp.s"
	E:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S P:\se402-master\alg-sandbox\alg-test-cpp\main.cpp -o CMakeFiles\alg_test.dir\main.cpp.s

# Object files for target alg_test
alg_test_OBJECTS = \
"CMakeFiles/alg_test.dir/main.cpp.obj"

# External object files for target alg_test
alg_test_EXTERNAL_OBJECTS =

alg_test.exe: CMakeFiles/alg_test.dir/main.cpp.obj
alg_test.exe: CMakeFiles/alg_test.dir/build.make
alg_test.exe: CMakeFiles/alg_test.dir/linklibs.rsp
alg_test.exe: CMakeFiles/alg_test.dir/objects1.rsp
alg_test.exe: CMakeFiles/alg_test.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable alg_test.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\alg_test.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/alg_test.dir/build: alg_test.exe

.PHONY : CMakeFiles/alg_test.dir/build

CMakeFiles/alg_test.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\alg_test.dir\cmake_clean.cmake
.PHONY : CMakeFiles/alg_test.dir/clean

CMakeFiles/alg_test.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" P:\se402-master\alg-sandbox\alg-test-cpp P:\se402-master\alg-sandbox\alg-test-cpp P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug P:\se402-master\alg-sandbox\alg-test-cpp\cmake-build-debug\CMakeFiles\alg_test.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/alg_test.dir/depend

