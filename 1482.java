class Solution {
    public boolean isPossible(int[] doomDay,int m,int k,int midDay){
        int bucketMade =0;
        int adjcentFlower =0;
        for(int i: doomDay){
            if(i <= midDay){
                adjcentFlower++;
                if(adjcentFlower == k){
                    bucketMade++;
                    adjcentFlower = 0;
                }
            }else{
                adjcentFlower = 0;
            }
        }
        return bucketMade >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length) {
            return -1;
        }

        int minDay  = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i : bloomDay){
            minDay = Math.min(minDay,i);
            maxDay = Math.max(maxDay,i);
        }
        
        int ans = 0;
        while(minDay <= maxDay){
            int midDay = minDay + (maxDay - minDay)/2;
            if(isPossible(bloomDay,m,k,midDay)){
                ans = midDay;
                maxDay = midDay -1;
            }else{
                minDay = midDay +1;
            }
        }
        return ans;
    }
}