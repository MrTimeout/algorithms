class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        int temp, te;
        for(;left <= right; left++)
        {
            te = left;
            while(te > 0 && (temp = te%10) != 0 && left%(temp)==0)
                te /= 10;
            if(te == 0)
                list.add(left);
        }
        return list;
    }
}
