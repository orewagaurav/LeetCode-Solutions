class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]= nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int[] result = new int[nums.length];
        int index = 0;
        for(int i :nums){
            if(i != 0){
                result[index++] = i;
            }
        }
        
        return result;
    }
}