class Solution {
    public int reverse(int x) {
        int r = 0, t;
        for(;x != 0;)
        {
            t = x%10;
            if(r > Integer.MAX_VALUE/10 || (r > Integer.MAX_VALUE/10 && t > 7))
                return 0;
            if(r < Integer.MIN_VALUE/10 || (r < Integer.MIN_VALUE/10 && t < -8))
                return 0;
            r = r*10 + t;
            x /= 10;
        }
        return r;
    }
}
