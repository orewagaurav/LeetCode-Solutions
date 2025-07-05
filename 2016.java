class Solution {
    public int maximumDifference(int[] nums) {
        int i =0;
        int j = 1;
        int maxDiff = 0;
        while(j<nums.length){
            if(nums[j]>nums[i]){
                int diff = nums[j] - nums[i];
                maxDiff = Integer.max(maxDiff,diff);
            }
            else{
                i = j;
            }
            j++;
        }
        if(maxDiff == 0) return -1;
        else return maxDiff;
    }
}