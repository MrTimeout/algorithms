package main

import "fmt"

func main() {
	fmt.Println(insertionSort([]int{5, 2, 4, 6, 1, 3}))
}

func insertionSort(arr []int) []int {
	j := 1
	for j < len(arr) {
		key := arr[j]
		i := j - 1
		for i >= 0 && arr[i] > key {
			arr[i + 1] = arr[i]
			i--
		}
		arr[i + 1] = key
		j++
	}
	return arr
}