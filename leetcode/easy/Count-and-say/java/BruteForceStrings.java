class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String str = "1", temp;
        int j, cont;
        for(int i = 1; i < n; i++)
        {
            temp = "";
            cont = 1;
            for(j = 1; j < str.length(); j++)
            {
                if(str.charAt(j-1) == str.charAt(j))
                    cont++;
                else
                {
                    temp = String.format("%s%d%c", temp, cont, str.charAt(j-1));
                    cont = 1;
                }
            }
            if(cont > 0)
                temp = String.format("%s%d%c", temp, cont, str.charAt(j-1));
            str = temp;
        }
        return str;
    }
}
