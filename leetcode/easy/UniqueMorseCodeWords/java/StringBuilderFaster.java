class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> s = new HashSet<String>();
        for(String str: words)
            s.add(transform(str));
        return s.size();
    }
    public String transform(String word)
    {
        String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder r = new StringBuilder();
        for(char c: word.toCharArray())
            r.append(code[c-97]);
        return r.toString();
    }
}
