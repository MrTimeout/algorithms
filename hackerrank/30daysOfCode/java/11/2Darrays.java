import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solution(int[][] arr) {
        int sum, max = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length/2; i++) {
            for(int j = 0; j <= arr[i].length/2; j++) {
                sum = arr[i+1][j+1];
                for(int k = i; k < i+3; k+=2) 
                    for(int kk = j; kk < j+3; kk++)
                        sum += arr[k][kk];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(solution(arr));
        scanner.close();
    }
}
