
public class Solution
{

    public static int simpleArraySum(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
            sum += i;
        return sum;
    } 
    
    public static void main(String... args)
    {
        System.out.printf("Sum(arr) = %d\n", simpleArraySum(new int[]{1, 2, 3, 4}));
    }

}
