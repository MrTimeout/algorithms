public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        java.util.Set<Integer> set = new java.util.HashSet<Integer>();
        int f = 0;
        for(int i: ar)
        {
            if(set.contains(i))
            {
                set.remove(i);
                f++;
            }
            else
            {
                set.add(i);
            }
        }
        return f;
    }
}
