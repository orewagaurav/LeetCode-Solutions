class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n  = nums.length;
        int[] result = new int[n];
        int index = 0;
        for(int i =0 ;i<n;i++){
            if(nums[i] == 0){
                result[index++] = nums[i];
            }
            else if(nums[i] > 0){
                result[index++] = nums[(i +nums[i])%n];
            }else{
                int pos = (n +((nums[i] %n) +i))%n;
                result[index++] = nums[pos];
            }
        }
        return result;
    }
}