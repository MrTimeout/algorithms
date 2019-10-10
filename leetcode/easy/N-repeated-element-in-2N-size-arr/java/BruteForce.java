class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int n = A.length/2;
        for(int i: A)
        {
            if(!m.containsKey(i))
            {
                m.put(i, 1);
            }
            else
            {
                if(m.get(i)+1 == n)
                    return i;
                m.put(i, new Integer(m.get(i)+1));
            }
        }
        return -1;
    }
}
