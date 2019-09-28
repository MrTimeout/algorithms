class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        if(strs.length == 0)
            return "";
        String r = strs[0];
        for(int i = 1; i < strs.length; i++)
        {
            if((r = lcp(r, strs[i])).equalsIgnoreCase(""))
               return ""; 
        }
        return r;
    }

    public String lcp(String a, String b)
    {
        int m = a.length() > b.length() ? b.length() : a.length();
        String r = "";
        for(int i = 0; i < m; i++)
        {
            if(a.charAt(i) != b.charAt(i))
                break;
            else
                r = String.format("%s%c", r, a.charAt(i));
        }
        return r;
    }
}

public class BruteForce
{

    public static void main(String[] args)
    {
        System.out.println((new Solution()).longestCommonPrefix(args));
    }

}
