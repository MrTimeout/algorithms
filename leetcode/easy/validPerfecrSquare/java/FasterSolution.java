class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        int left = 0, right = num/2;
        int mid;
        while(left <= right)
        {
            mid = left + (right - left)/2;
            if(num / mid == mid) return num % mid == 0;
            else if(mid < num/mid) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
