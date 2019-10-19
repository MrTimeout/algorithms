import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int binary(int n)
    {
        int max = 0, ma = 0;
        while(n > 0) 
        {
            if(n%2 == 1)
                ma++;
            else 
                ma = 0;
            if(ma > max)
                max = ma;
            n/=2;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(binary(n));
        scanner.close();
    }
}
