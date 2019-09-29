package algorithms;

public class BinarySearch
{
    public static boolean search(int[] arr, int target) 
    {
        int lo = 0, hi = arr.length-1;
        int mid = (hi + lo) / 2;
        for(int i = 0; i < arr.length; i++)
            if(arr[mid] < target)
                lo = mid+1;
            else if(arr[mid] > target)
                hi = mid-1;
            else
                return true;
        return false;
    }
    public static boolean isNumeric(String arg)
    {
        for(char c: arg.toCharArray())
            if(c < 48 || c > 57)
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < args.length; i++)
            if(isNumeric(args[i]))
                System.out.printf("%t", search(arr, Integer.parseInt(args[i])));
    }
}

/**
 *
 * BinarySearch:
 *
 * arr = [1, 2, 3, 4, 5], target = 5
 *
 * lo = 0, hi = 4, mid = (4+0)/2 = 2
 *
 * if arr[mid] > target
 *  hi = mid-1
 * else if arr[mid] less target
 *  lo = mid+1
 * else
 *  return true
 *
 */
