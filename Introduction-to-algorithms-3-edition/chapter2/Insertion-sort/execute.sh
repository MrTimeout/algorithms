#!/usr/bin/env bash

# It necessary to use -lstdc++ when you use the command gcc
gcc main.cpp -Wall -Wextra -Werror -lstdc++ -o compile && ./compile

