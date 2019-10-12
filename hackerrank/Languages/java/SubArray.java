import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final java.util.Scanner scan = new java.util.Scanner(System.in);

    static int subarray(int[] arr)
    {
        int c = 0, temp, k;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                temp = 0;
                k = 0;
                while(i - k >= 0 && (temp += arr[i-k]) < 0)
                    c++;
                temp = 0;
                while(i + k < arr.length && (temp += arr[i-k]) < 0)
                    c++;
            }
        }
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
        
    }
}
