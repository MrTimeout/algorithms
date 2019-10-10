class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int s, e, temp;
        for(int i = 0; i < A.length; i++)
        {
            s = 0;
            e = A[i].length-1;
            while(s<e)
            {
                temp = A[i][s];
                A[i][s] = A[i][e] == 0 ? 1 : 0;
                A[i][e] = temp == 0 ? 1 : 0;
                s++; e--;
            }
            if(s==e) A[i][s] = A[i][s] == 0 ? 1 : 0;
        }
        return A;
    }
}
