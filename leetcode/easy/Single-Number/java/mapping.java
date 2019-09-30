
import java.util.HashSet;

class Solution {
    /*
     * arr not empty, so we dont need to handle this possible event
     * arr with only one non repeated value
     * we loop all the elements in the arr, using a hashmap
     *
     */  
    public int singleNumber(int[] nums)
    {
        HashSet<Integer> map = new HashSet<Integer>();
        for(int x: nums)
            if(map.contains(x))
                map.remove(x);
            else
                map.add(x);
        return map.iterator().next();
    }
}

public class mapping
{
    public static void main(String[] args)
    {
        int[] cases = new int[]{2, 2, 1};
        System.out.println((new Solution()).singleNumber(cases));
    }
}
