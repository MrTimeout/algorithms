package main

import "fmt"

func main() {
	fmt.Println(isPalindrome(22))
}

//negatives out
//values modulus 10 and different from 0 out
//revertX = 0
//for-loop x > revertX
//revertX = revertX*10 + x%10
//x /= 10
//end for-loop
//return x == revertX || x == revertX/10
func isPalindrome(x int) bool {
	if x < 0 || (x%10 == 0 && x != 0) {
		return false
	}
	revertX := 0
	for x > revertX {
		revertX = revertX*10 + x%10
		x /= 10
	}
	return x == revertX || x == revertX/10
}
