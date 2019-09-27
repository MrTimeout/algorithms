class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            temp = target-nums[i];
            if(map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]),i};
            map.put(temp, i);
        }
        return null;
    }
}
