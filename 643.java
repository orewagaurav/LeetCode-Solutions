class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sum  = 0;
        int maxSum = Integer.MIN_VALUE;
        while(end < nums.length){
            int windowSize = end - start + 1;
            sum += nums[end];
            if(windowSize < k){
                end++;
            }
            else{
                maxSum  = Math.max(maxSum,sum);
                sum  -= nums[start];
                start++;
                end++;
            }
        }
        double result = (double)maxSum/k;
        return result;
    }
}