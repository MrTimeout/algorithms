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
        String r = "";
        for(char c: word.toCharArray())
            r = String.format("%s%s", r, code[c-97]);
        return r;
    }
}
