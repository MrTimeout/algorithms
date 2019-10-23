import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] e) {
        this.elements = e;
    }

    public void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: this.elements) {
            if(i > max) max = i;
            if(i < min) min = i;
        }
        this.maximumDifference = Math.abs(max-min);
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
