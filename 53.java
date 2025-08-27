class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1;i<n;i++){
            currentSum = Math.max(nums[i],nums[i]+currentSum);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}