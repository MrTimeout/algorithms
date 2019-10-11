public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long r = 0;
        for(long l: ar)
            r += l;
        return r;
    }
}
