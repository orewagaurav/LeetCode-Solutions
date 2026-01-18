public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int  i = 1;
        int  j = n;
        while(i <= j){
            int mid = i + (j-i)/2;
            int res = guess(mid);
            if( res == 0) return mid;
            else if(res == -1){
                j = mid -1;
            }
            else if(res == 1){
                i = mid+1;
            }
        }
        return 0;
    }
}