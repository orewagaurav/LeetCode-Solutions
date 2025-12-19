class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int zeros = 0;
        int maxLen = 0;
        while(end < nums.length){
            if(nums[end]== 0){
                zeros++;
            }
            while(zeros > 1){
                if(nums[start]== 0){
                    zeros--;
                }
                start++;
            }
            int len = end - start + 1;
            maxLen = Math.max(maxLen,len);
            end++;
        }
        //bcz one is zero [0,1,1,1] so 3 not 4
        return maxLen-1;
    }
}