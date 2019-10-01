/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int t, mid, lo = 1, hi=n;
        if(n == 1)
            return 1;
        mid = (lo+hi)/2;
        while((t=guess(mid)) != 0)
        {
            if(t==1) { lo=mid+1; }
            else if(t == -1) { hi=mid-1; }
            mid=(int)((float)lo/2 + (float)hi/2);
        }
        return mid;
    }
}
