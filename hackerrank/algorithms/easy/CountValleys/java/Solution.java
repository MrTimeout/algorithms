public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Stack<Character> stack = new Stack<Character>();
        int r = 0;
        for(char c: s.toCharArray())
        {
            if(stack.size() > 0 && stack.peek() != c)
                stack.pop();
            else
                stack.push(c);
            if(stack.size() == 0 && c == 'U')
                r++;
        }
        return r;
    }
    
}
