public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int a = 0, x = (int) n % s.length();
        long b = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                a++;
                if(i < n)
                    b++;
            }
        }
        return (n/s.length())*a+b;
    }
}
