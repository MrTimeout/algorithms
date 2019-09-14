package main

import "fmt"

func main() {
	fmt.Println(twoSum([]int{3, 2, 4}, 6))
}

//create an empty map
//for-loop
//if nums[i] in map
//return true
//else
//map[target - nums[index]] = index
//end-if
//end for-loop
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		if k, ok := m[nums[i]]; ok {
			return []int{k, i}
		}
		m[target-nums[i]] = i
	}
	return nil
}
