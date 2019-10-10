class Solution {
    public String toLowerCase(String str) {
        String r = "";
        for(char c: str.toCharArray())
            r = String.format("%s%c", r, c >= 65 && c <= 90 ? c+32 : c);
        return r;
    }
}
