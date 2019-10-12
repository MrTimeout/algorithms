import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int swap, c = 0, k;
        boolean flag = false;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < q.length; i++)
        {
            if(q[i] == i+1)
                continue;
            k = i;
            while(k+1 < q.length && q[k+1] - q[k] < 0)
            {
                swap = q[k];
                q[k] = q[k+1];
                q[k+1] = swap;
                c++; k++;
                if(m.containsKey(q[k]))
                {
                    m.put(q[k], m.get(q[k])+1);
                    if(m.get(q[k]) >= 3)
                    {
                        flag = true;
                        break;
                    }
                }
                else
                    m.put(q[k], 1);
            }
            if(flag) break;
            k = i;
            while(k-1 >= 0 && q[k] - q[k-1] < 0)
            {
                swap = q[k];
                q[k] = q[k-1];
                q[k-1] = swap;
                if(m.containsKey(q[k]))
                {
                    m.put(q[k], m.get(q[k])+1);
                    if(m.get(q[k]) >= 3)
                    {
                        flag = true;
                        break;
                    }
                }
                else
                    m.put(q[k], 1);
                c++; k--;
            }
            if(flag) break;
        }
        if(flag)
            System.out.println("Too chaotic");
        else
            System.out.println(c);
    }

    static void printArr(int[] arg)
    {
        System.out.printf("\n[ ");
        for(int t: arg)
            System.out.print(t + " ");
        System.out.printf("]\n");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
