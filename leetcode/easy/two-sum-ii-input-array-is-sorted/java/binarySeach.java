class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        System.out.println(binarySearch(numbers, 7));
        return null;
    }
    public int binarySearch(int[] nums, int target)
    {
        int lo = 0, hi = nums.length, mid;
        for(;lo < hi;)
        {
            mid = (lo+hi)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                lo = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
