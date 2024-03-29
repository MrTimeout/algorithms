import java.util.*;
import java.io.*;

class Calculator {
    public int power(int p, int pp) throws java.lang.Exception {
        if(p < 0 || pp < 0)
            throw new java.lang.Exception("n and p should be non-negative");
        return (int) Math.pow(p, pp);
    }
}
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
