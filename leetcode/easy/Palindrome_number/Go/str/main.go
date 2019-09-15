package main

import (
	"fmt"
	"strconv"
)

func main() {
	fmt.Println(isPalindrome(291))
}

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	str := strconv.Itoa(x)
	temp, i := len(str), 0
	for i < temp/2 {
		if str[i] != str[temp-i-1] {
			return false
		}
		i++
	}
	return true
}
