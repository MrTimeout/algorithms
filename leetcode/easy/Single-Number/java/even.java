
class Solution
{
    public int singleNumber(int[] nums)
    {
        int result = 0;
        for(int x: nums)
            result ^= x;
        return result;
    }
}

public class even
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 2, 3};
        System.out.println((new Solution()).singleNumber(arr));
    }
}

