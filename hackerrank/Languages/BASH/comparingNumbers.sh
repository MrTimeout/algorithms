#!/bin/bash

read x
read y

if [[ x -lt y ]]; then 
    echo -n "X is less than Y"
elif [[ x -gt y ]]; then
    echo -n "X is greater than Y"
else
    echo -n "X is equal to Y"
fi
