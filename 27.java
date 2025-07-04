class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        return left;
    }
}