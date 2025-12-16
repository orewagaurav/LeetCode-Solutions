class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int currentLeftProduct = 1;
        for(int i =0;i<n;i++){
            output[i] = currentLeftProduct;
            currentLeftProduct *= nums[i];
        }
        int currentRightProduct = 1;
        for(int i =n-1;i>=0;i--){
            //output[i] me phle se hi left product hai;
            output[i] *= currentRightProduct;
            currentRightProduct *= nums[i];
        }
        return output;
    }
}