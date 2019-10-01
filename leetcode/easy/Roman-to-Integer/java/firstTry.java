class Solution {
    public int romanToInt(String str) {
        int result = 0, len = str.length();
        char c;
        for(int i = 0; i < len; i++)
        {
            c = str.charAt(i);
            switch(c)
            {
                case 'M':
                    result += 1000;
                break;
                case 'D':
                    result += 500;
                break;
                case 'C':
                    if(i+1 < len && (str.charAt(i+1) == 'M' || str.charAt(i+1) == 'D'))
                        result -= 100;
                    else
                        result += 100;
                break;
                case 'L':
                    result += 50;
                break;
                case 'X':
                    if(i+1 < len && (str.charAt(i+1) == 'L' || str.charAt(i+1) == 'C'))
                        result -= 10;
                    else
                        result += 10;
                break;
                case 'V':
                    result += 5;
                break;
                case 'I':
                    if(i+1 < len && (str.charAt(i+1) == 'V' || str.charAt(i+1) == 'X'))
                        result -= 1;
                    else
                        result += 1;
                break;
            }
        }
        return result;
    }
}
