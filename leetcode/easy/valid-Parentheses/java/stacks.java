class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        if(s.length() == 1)
            return false;
        Stack<java.lang.Character> st = new Stack<>();
        char c;
        st.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            c = s.charAt(i);
            if(!st.isEmpty() && (c == st.peek()+1 || c == st.peek()+2))
                st.pop();
            else if(c == 40 || c == 123 || c == 91)
                st.push((Character) c);
            else
                return false;
        }
        return st.size() == 0;
    }
}
