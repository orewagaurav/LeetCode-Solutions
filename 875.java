class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = 0;
        for(int i: piles){
            high  = Math.max(high,i);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canEat(piles,mid,h)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    private boolean canEat(int[] piles,int speed , int h){
        long hourSpent = 0;
        for(int i : piles){
            hourSpent += (i + speed -1)/speed;
        }
        return hourSpent <= h;
    }
}