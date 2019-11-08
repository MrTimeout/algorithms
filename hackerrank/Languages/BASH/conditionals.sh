#!/bin/bash

read c

if [[ ${c,,} = "y" ]]; then echo -n "YES"
elif [[ ${c^^} = "N" ]]; then echo -n "NO"
fi
