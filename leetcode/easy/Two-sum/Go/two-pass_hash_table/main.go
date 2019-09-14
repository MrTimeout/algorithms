package main

import "fmt"

func main() {
	fmt.Println(twoSum([]int{3, 2, 4}, 6))
}

//map
//for-loop
//map[value] = index
//end for-loop
//for-loop
//if target - nums[index] in map
//return values
//else
//continue
//end for-loop
//We sacrifice memory to achieve a faster program
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		if _, ok := m[nums[i]]; !ok {
			m[nums[i]] = i
		}
	}
	for j := 0; j < len(nums); j++ {
		if index, ok := m[target-nums[j]]; ok && index != j {
			return []int{j, index}
		}
	}
	return nil
}
