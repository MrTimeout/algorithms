class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character,Integer> m = new HashMap<>();
        m.put('L', 0);
        m.put('D', 0);
        m.put('U', 0);
        m.put('R', 0);
        for(char c: moves.toCharArray())
            m.put(c,new Integer(m.get(c).intValue()+1));
        return m.get('R').equals(m.get('L')) && m.get('U').equals(m.get('D'));
    }
}
