class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] r = new int[A.length];
        int x = 0, y = A.length-1;
        for(int i: A)
            if(i % 2 == 0) r[x++]=i;
            else r[y--]=i;
        return r;
    }
}
