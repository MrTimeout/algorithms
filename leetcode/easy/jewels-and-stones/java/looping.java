class Solution {
    public int numJewelsInStones(String J, String S) {
        int cont = 0;
        for(char j: J.toCharArray())
            for(char s: S.toCharArray())
                if(s == j)
                    cont++;
        return cont;
    }
}
