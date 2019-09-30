
import java.util.HashMap;
import java.util.Collections;

class Solution
{
    /*
     * From 1 to 3999
     * MMCM
     */
    public int romanToInt(String s)
    {
        int result = 0;
        char c;
        HashMap<java.lang.Character, java.lang.Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        Collections.sort(m, new Comparator<Integer>()
                {
                    public int compare(Integer i, Integer ii)
                    {
                        return ii.compareTo(i);
                    }
                });
        for(int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            switch(c)
            {
                case 'M':
                case 'D':
                    result += m.get(c);
                break;
                case 'C':
                    switch(str.charAt(i+1))
                    {
                        case 'D':
                        case 'M':
                            result -= m.get(c);
                        break;
                        default:
                            result += m.get(c);
                        break;

                    }
                break;
                case 'L':
                    result += m.get(c);
                break;
                case 'X':
                    switch(str.charAt(i+1))
                    {
                        case 'C':
                        case 'L':   
                            result -= m.get(c);   
                        break;
                        default:
                            result += m.get(c);
                        break;    
                    }
                break;
                case 'V':
                    
            }
        }
        
    }
}

public class FirstTry
{
    public static void main(String[] args)
    {
        for(String str: args)
            System.out.println(romanToInt(str));
    }
}
