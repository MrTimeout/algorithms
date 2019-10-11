import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String avoidMe = " !,?._'@";
        StringBuilder sb = new StringBuilder();
        int f = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(avoidMe.indexOf(s.charAt(i)) == -1)
            {
                sb.append(s.charAt(i));
            }
            else if(i-1 >= 0 && avoidMe.indexOf(s.charAt(i-1)) == -1)
            {
                sb.append('\n');
                f++;
            }
        }
        if(avoidMe.indexOf(s.charAt(s.length()-1)) == -1)
        {
            f++;
        }
        System.out.println(f);
        System.out.print(sb.toString());
        scan.close();
    }
}

