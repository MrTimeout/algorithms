import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        java.util.List<Integer> l = new java.util.ArrayList<>(n);
        for(;n>0;n--)
            l.add(scan.nextInt());
        n = scan.nextInt();
        for(;n>0;n--)
        {
            scan.nextLine();
            if(scan.nextLine().equalsIgnoreCase("Insert"))
                l.add(scan.nextInt(), scan.nextInt());
            else
                l.remove(scan.nextInt());
        }
        for(Integer i: l)
            System.out.printf("%d ", i);
    }
}
