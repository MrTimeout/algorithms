import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt(), o = scan.nextInt();
        BitSet b = new BitSet(n);
        BitSet bb = new BitSet(n);
        scan.nextLine();
        for(;o > 0;o--)
        {
            String[] str = scan.nextLine().split(" ");
            if(str[0].equals("AND"))
                if(str[1].equals("1")) b.and(bb);
                else bb.and(b);
            else if(str[0].equals("OR"))
                if(str[1].equals("1")) b.or(bb);
                else bb.or(b);
            else if(str[0].equals("XOR"))
                if(str[1].equals("1")) b.xor(bb);
                else bb.xor(b);
            else if(str[0].equals("FLIP"))
                if(str[1].equals("1")) b.flip(Integer.parseInt(str[2]));
                else bb.flip(Integer.parseInt(str[2]));
            else if(str[0].equals("SET"))
                if(str[1].equals("1")) b.set(Integer.parseInt(str[2]));
                else bb.set(Integer.parseInt(str[2]));
            System.out.printf("%d %d\n", b.cardinality(), bb.cardinality());
        }
    }
}

