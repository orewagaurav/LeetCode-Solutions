class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int maxLen = 0;
        while(end < nums.length){
            if(nums[end] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            int len  = end - start + 1;
            maxLen = Math.max(maxLen,len);
            end++;
        }
        return maxLen;
    }
}