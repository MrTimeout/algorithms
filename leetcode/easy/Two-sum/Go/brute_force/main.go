package main

func main() {

}

//Thinking about the answer:
//for-loop i-> len of nums i
//for-loop i+1-> len of nums j
//if target - nums[i] == nums[j]
//return true
//else
//continue
//end for-loop
//end for-loop
//result
//runtime: O(n^2) = O(n) * O(n); for each element O(n) you have to loop for in all the array
//memory : O(1)
func twoSum(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if target-nums[i] == nums[j] {
				return []int{i, j}
			}
		}
	}
	return nil
}
