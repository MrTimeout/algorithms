import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE, sum;
        for(int i = 0; i <= (arr.length/3)+1; i++)
        {
            for(int j = 0; j <= (arr[i].length/3)+1; j++)
            {
                sum = arr[i+1][j+1];
                for(int k = j ; k < j+3; k++)
                    sum += arr[i][k] + arr[i+2][k];
                if(sum > max)
                    max = sum;
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

        System.out.println(hourglassSum(arr));

        scanner.close();
    }
}
