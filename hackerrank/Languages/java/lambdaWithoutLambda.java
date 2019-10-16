import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
 public PerformOperation isOdd()
 {
    return new PerformOperation()
    {
        @Override
        public boolean check(int a)
        {
            return a%2!=0;
        }
    };
 }

 public PerformOperation isPrime()
 {
    return new PerformOperation()
    {
        @Override
        public boolean check(int a)
        {
            if(a == 2) return true;
            int c = 2;
            while(c < a/2 && a%c != 0)
                c++;
            return c == a/2;
        }
    };
 }

 public PerformOperation isPalindrome()
 {
    return new PerformOperation()
    {
        @Override
        public boolean check(int a)
        {
            if(a < 0 || (a%10 == 0 && a != 0))
                return false;
            int revert = 0;
            while(a > revert)
            {
                revert = revert*10 + a%10;
                a/=10;
            }
            return revert==a || revert/10 == a;
        }
    };
 }


}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
