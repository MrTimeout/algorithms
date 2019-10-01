class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String r = "";
        int i = 0;
        while(true)
        {
            for(int j = 0; j < strs.length-1;)
            {
                if(i >= strs[j].length() || i >= strs[j+1].length() || strs[j].charAt(i) != strs[++j].charAt(i))
                    return r;
            }
            r = String.format("%s%c", r, strs[0].charAt(i++));
        }
    }
}
