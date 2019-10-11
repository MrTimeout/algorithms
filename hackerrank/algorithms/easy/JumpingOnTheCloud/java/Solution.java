public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int n = 0;
        for(int i = 0; i < c.length-1; )
        {
            if(i+2 < c.length && c[i+2] == 0)
            {
                i+=2;
                n++;
            }
            else if(c[i+1] == 0)
            {
                i++;
                n++;
            }
        }
        return n;
    }
}
