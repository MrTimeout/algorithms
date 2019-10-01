class Solution {
    public String defangIPaddr(String address) {
        String str = "";
        for(char c: address.toCharArray())
        {
            if(c == '.')
                str = String.format("%s[.]", str);
            else
                str = String.format("%s%c", str, c);
        }
        return str;
    }
}
