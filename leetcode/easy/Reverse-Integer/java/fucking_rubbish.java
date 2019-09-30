class Solution {
    public int reverse(int x) {
        List<Integer> l = r(x);
        List<Integer> ll = r(x < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE);
        int r = 0;
        System.out.println(l);
        System.out.println(ll);
        if(l.size() == 10)
        {
            int i = 0, v;
            for(; i < l.size(); i++)
            {
                if((v = l.get(i).compareTo(ll.get(ll.size()-i-1))) == 1)
                    return 0;
                else if(v == -1)
                    break;
                else
                    r = r*10 + l.get(i);
            }
            for(;i < l.size();i++)
                r = r*10 + l.get(i);
        }
        else
        {
            for(Integer i: l)
                r = r*10 + i;
        }
        return r*(x < 0 ? -1 : 1);
    }
    
    public List<Integer> r(int x)
    {
        List<Integer> l = new ArrayList<Integer>();
        for(;x != 0;)
        {
            l.add(Math.abs(x%10));
            x /= 10;
        }
        return l;
    }
}
