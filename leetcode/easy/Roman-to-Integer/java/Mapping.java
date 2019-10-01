class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> ints = new HashMap<Character, Integer>();
        ints.put('I', 1);
        ints.put('V', 5);
        ints.put('X', 10);
        ints.put('L', 50);
        ints.put('C', 100);
        ints.put('D', 500);
        ints.put('M', 1000);
        int len = s.length(), sum = 0;
        for(int i = 0; i < len; i++)
        {
            if(i+1 < len && ints.get(s.charAt(i)) < ints.get(s.charAt(i+1)))
            {
                sum -= ints.get(s.charAt(i));
            }
            else
            {
                sum += ints.get(s.charAt(i));
            }
        }
        return sum;
    }
}
