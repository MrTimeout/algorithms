package main

import "fmt"

func main() {
	binaryP(-12)
}

func binaryP(x int8) {
	var (
		v int8
		u uint8
	)
	v = x             // 00000111
	u = uint8(v) >> 1 // 00000111 >> 1 = 00000011
	if v < 0 {
		u = ^u
	}
	fmt.Printf("%.8b or %d\n", v, v)
	fmt.Printf("%.8b or %d\n", u, u)                          //10000101
	fmt.Printf("The sign of the numbner %d is %.8b\n", x, ^x) //00001011
}

func reverse(x int) int {
	var m int32
	var sign int
	sign = x & 1
	if x < 0 {
		m = -int32(^uint32(0)>>1) - 1
		reverse := 0
		for x != 0 {
			reverse = 10*reverse + x%10
			x /= 10
		}
	} else {
		m = int32(^uint32(0) >> 1)
		reverse := 0
		for x != 0 {
			reverse = 10*reverse + x%10
			x /= 10
		}
	}
	fmt.Println(m)
	fmt.Println(sign)
	return 0
}
