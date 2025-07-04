class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum=0;
        int maxSum =Integer.MIN_VALUE;

        while(j<nums.length){
            int windowSize = j-i+1;
            sum += nums[j];
            if(windowSize != k){
                j++;
            }
            else if(windowSize == k){
                maxSum = Math.max(maxSum,sum);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        double result = (double)maxSum / k;
        return result;
    }
}