import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n, d;

        //Reading input to store values.
        n = scan.nextInt();
        java.util.HashMap<Integer, List<Integer>> m = new java.util.HashMap<>();
        java.util.List<Integer> l;
        for(int i = 0; i < n; i++)
        {
            d = scan.nextInt();
            l = new ArrayList<Integer>();
            for(int j = 0; j < d; j++)
                l.add(scan.nextInt());
            m.put(i, l);
        }
        //Reading input to parse it and answer
        n = scan.nextInt();
        int pos;
        for(int i = 0; i < n; i++)
        {
            d = scan.nextInt();
            pos = scan.nextInt();
            if(m.containsKey(d-1) && pos-1 < m.get(d-1).size())
                System.out.println(m.get(d-1).get(pos-1));
            else
                System.out.println("ERROR!");
        }
    }
}
