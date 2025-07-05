class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0 , j = 1;
        int maxProfit = 0;
        while(j<n){
            if(prices[j] > prices[i]){
                int profit = prices[j] - prices[i];
                maxProfit = Integer.max(maxProfit,profit);
            }
            else{
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
}