public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long a = howMuch(s, s.length()), x = n % s.length(), b = 0;
        if(x == 0 && n < s.length())
            b = howMuch(s, s.length());
        else if(x > 0)
            b = howMuch(s, x);
        return (n/s.length())*a+b;
    }

    static long howMuch(String s, long v)
    {
        long a = 0;
        for(int i = 0; i < v; i++)
            if(s.charAt(i) == 'a')
                a++;
        return a;
    }
}
