import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  int testCases = Integer.parseInt( in .nextLine());
  Pattern p = Pattern.compile("\\<(.+[^\\>])\\>(.+[^\\<])\\<\\/\\1\\>");
  while (testCases > 0) {
   String line = in .nextLine();
   System.out.println("Line: " + line);

   Matcher m = p.matcher(line);
   if (!m.find())
    System.out.println("None");
   else
    while (m.find())
     System.out.println(m.group(2));

   testCases--;
  }
 }
}
