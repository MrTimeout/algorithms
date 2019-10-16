import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime
{
    public static void checkPrime(int... s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i: s)
            if(isPrime(i))
                sb.append(i).append(' ');
        System.out.println(sb.toString());
    }

    private static boolean isPrime(int v)
    {
        if(v==2)
            return true;
        if(v <= 1 || v%2 == 0)
            return false;
        int i = 3;
        int max = (int) Math.sqrt(v);
        while(i <= max)
            if(v%i++==0)
                return false;
        return true;
    }
}

public class Solution {
