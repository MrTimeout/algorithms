class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int temp;
        for(int i = 0; i < numbers.length; i++)
            if((temp = binarySearch(numbers, target-numbers[i])) != -1 && temp != i)
                return sort(new int[]{i, temp});
        return new int[]{0, 0};
    }
    public int binarySearch(int[] nums, int target)
    {
        int lo = 0, hi = nums.length-1, mid;
        for(;lo <= hi;)
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
    public int[] sort(int[] arr)
    {
        return arr[0] > arr[1] ? new int[]{arr[1], arr[0]} : arr;
    }
}

public class binarySearch
{

    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 7, 11, 5};
        System.out.println((new Solution()).twoSum(arr, 9)[1]);
    }

}
