class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1)
            return false;
        int s = (int)Math.sqrt(num);
        int r = 1;
        for(int i = 2; i <= s; i++)
            if(num % i == 0)
                if(num/i == i)
                    r += i;
                else
                    r += i + num/i;
        return r == num;
    }
}
