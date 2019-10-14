import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String a, b;

        a = scan.nextLine();
        b = scan.nextLine();

        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        System.out.println(aa.add(bb));
        System.out.println(aa.multiply(bb));

    }
}
