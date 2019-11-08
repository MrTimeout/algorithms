#!/bin/bash

# or 
# seq 1 2 99

# or
# for i in $(seq 1 2 99)
# do
#    echo $i
# done

# or
# for ((i=1;i<100;i+=2))
# do
# echo $i
# done

# or
for ((i=0;i<100;i++))
do
    if [[ "((i%2))" -ne 0 ]]; 
    then
        echo $i
    fi
done
