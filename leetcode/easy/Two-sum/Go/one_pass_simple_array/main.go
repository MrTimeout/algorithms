package main

func main() {

}

func isHere(arr []int, trgt int) int {
	len := len(arr)
	for i := 0; i < len; i++ {
		if arr[i] == trgt {
			return i
		}
	}
	return -1
}

//<-nums
//for-loop
//rest
//if exists
//return
//else
//add to the arr
//
func twoSum(nums []int, target int) []int {
	len := len(nums)
	tempArr := make([]int, 0, len)
	var rest int
	for i := 0; i < len; i++ {
		rest = target - nums[i]
		if first := isHere(tempArr, nums[i]); i >= 1 && first != -1 {
			return []int{first, i}
		}
		tempArr = append(tempArr, rest)
	}
	return nil
}
