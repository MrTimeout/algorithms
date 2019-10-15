import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.nextLine();
        StringBuilder l;
        for(;n>0;n--)
        {
            String s = scan.nextLine();
            l = new StringBuilder();
            for(int i = 0; i < s.length(); i+=2)
            {
                System.out.print(s.charAt(i));
                if(i+1 < s.length()) l.append(s.charAt(i+1));
            }
            System.out.printf(" %s\n", l.toString());
        }
    }
}

