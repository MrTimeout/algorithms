class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> s = new HashMap<Integer,Integer>();
        for(int i: arr)
            if(!s.containsKey(i))
                s.put(i, 1);
            else
                s.put(i, new Integer(s.get(i)+1));
        return s.size() == new HashSet<Integer>(s.values()).size();
    }
}
