cmake_minimum_required(VERSION 3.6)

project(jniAndJava)

add_library(${PROJECT_NAME} SHARED jniAndJava.cpp Person.h Person.cpp)
