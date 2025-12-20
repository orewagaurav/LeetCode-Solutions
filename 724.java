class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum  = 0;
        int rightSum = 0;
        for(int i:nums){
            sum += i;
        }
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            rightSum  = sum - current - leftSum;
            if(leftSum == rightSum){
                return i;
            }
            leftSum  += nums[i];
        }
        return -1;
    }
}