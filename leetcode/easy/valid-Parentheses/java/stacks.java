class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        if(s.length() == 1)
            return false;
        Stack<java.lang.Character> st = new Stack<>();
        st.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            if(!st.isEmpty() && (s.charAt(i) == st.peek()+1 || s.charAt(i) == st.peek()+2))
                st.pop();
            else if(!st.isEmpty() && st.peek() == 40 && st.peek() == 132 || st.peek() == 91)
                st.push((Character) s.charAt(i));
            else
                return false;
        }
        return true;
    }
}
