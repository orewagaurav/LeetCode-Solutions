class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int sqr= nums[i]*nums[i];
            nums[i] = sqr;
        }
        Arrays.sort(nums);
        return nums;
    }
}