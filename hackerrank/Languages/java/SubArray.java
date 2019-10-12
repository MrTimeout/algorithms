import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final java.util.Scanner scan = new java.util.Scanner(System.in);

    static int subArray(int[] arr)
    {
        int c = 0, sum;
        for(int k = 0; k < arr.length; k++)
        {
            for(int i = 0; i+k < arr.length; i++)
            {
                sum = 0;
                for(int j = i; j <= i+k; j++)
                    sum += arr[j];
                if(sum < 0)
                    c++;
            }
        }
        return c;
    }

    static void printArr(int[] arr)
    {
        for(int i: arr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();
        System.out.println(subArray(arr));
    }
}

