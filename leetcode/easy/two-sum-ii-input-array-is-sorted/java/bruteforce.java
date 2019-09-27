class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++)
            for(int j = 0; j < i; j++)
                if(numbers[i] + numbers[j] == target)
                    return new int[]{++j, ++i};
        return null;
    }
}
