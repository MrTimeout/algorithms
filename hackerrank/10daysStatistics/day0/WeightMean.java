import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
            l.add(scan.nextInt());
        int a = 0, b = 0;
        for(int i = 0; i < n; i++)
        {
            int let = scan.nextInt();
            a += let * l.get(i);
            b += let;
        }
        System.out.printf("%.1f", (double) a/b);
    }
}

