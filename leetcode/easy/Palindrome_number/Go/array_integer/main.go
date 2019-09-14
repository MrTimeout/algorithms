package main

import "fmt"

func main() {
	fmt.Println(isPalindrome(292))
}

//if x < 0 then
// false
//end-if
//if x < 10 then
// true
//end-if
//arr = intSegment
//for-loop
//if arr[0] != arr[last]
//return false
//else
//continue
//end if
//end for-loop
//return true
func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	if x < 10 {
		return true
	}
	arr := intSegment(x)
	l := len(arr)
	for i := 0; i < l/2; i++ {
		if arr[i] != arr[l-1-i] {
			return false
		}
	}
	return true
}

//new arr
//while-loop trgt > 0
//arr[pos] = i % 10
//i /= 10
//end while-loop
func intSegment(i int) []int {
	arr := make([]int, 0, 10)
	for i > 0 {
		arr = append(arr, i%10)
		i /= 10
	}
	return arr
}
