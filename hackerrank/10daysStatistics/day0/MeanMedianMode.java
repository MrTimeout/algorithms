import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        int n = scan.nextInt();
        int x, j = n;
        for(;n > 0;n--)
        {
            x = scan.nextInt();
            l.add(x);
            if(m.containsKey(x))
                m.put(x, m.get(x)+1);
            else
                m.put(x, 1);
        }
        int max = Integer.MIN_VALUE;
        int mode = Integer.MAX_VALUE;
        double mean = 0.0;
        for(Map.Entry<Integer, Integer> e: m.entrySet())
        {
            if(e.getValue() > max)
            {
                max = e.getValue();
                mode = e.getKey();
            } else if(e.getValue() == max && e.getKey() < mode)
                mode = e.getKey();
            mean += e.getValue()*e.getKey();
        }
        Collections.sort(l);
        mean /= j;
        System.out.printf("%.1f\n%.1f\n%d\n", mean, (double)(l.get(j/2) + l.get(j/2 + (j%2==0 ? -1 : +1)))/2, mode);
    }
}

