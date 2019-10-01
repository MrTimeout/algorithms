class Solution {
    
    //1000, 100, 10, 1
    public String intToRoman(int num) {
        HashMap<Integer, Character> ints = new HashMap<Integer, Character>();
        ints.put(1, 'I');
        ints.put(5, 'V');
        ints.put(10, 'X');
        ints.put(50, 'L');
        ints.put(100, 'C');
        ints.put(500, 'D');
        ints.put(1000, 'M');
        String str = "";
        int x = 1000, z = 0, y;
        for(;num > 0;)
        {
            if(num >= x)//1000
            {
                y = num/x;
                if(y == 4 || num % x == 4)
                {
                    str = String.format("%s%c", str, ints.get(x));
                    str = String.format("%s%c", str, ints.get(x * ((z-1) % 2 == 0 ? 2 : 5)));
                    return str;
                }
                else
                {
                    for(int j = 0; j < y; j++)
                    {
                        str = String.format("%s%c", str, ints.get(x));
                    }
                }
                num %= x;
            }
            x /= z++ % 2 == 0 ? 2 : 5;
        }
        return str;
    }
}

