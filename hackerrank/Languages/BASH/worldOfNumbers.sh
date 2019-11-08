#!/bin/bash
read x
read y

echo -en $((x+y))"\n"$((x-y))"\n"$((x*y))"\n"$((x/y))
