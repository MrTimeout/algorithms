#!/bin/bash

read a
read b
read c

if [[ a -ne b ]] && [[ a -ne c ]] && [[ b -ne c ]]; then
    echo "SCALENE"
elif [[ a -eq b ]] && [[ a -eq c ]]; then
    echo "EQUILATERAL"
else 
    echo "ISOSCELES"
fi
