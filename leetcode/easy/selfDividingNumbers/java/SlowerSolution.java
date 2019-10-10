class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(;left <= right; left++)
            if(is(left))
                list.add(left);
        return list;
    }
    
    public static boolean is(int v)
    {
        for(char c: String.valueOf(v).toCharArray())
            if(c == '0' || v % (c-'0') != 0)
                return false;
        return true;
    }
        
}
