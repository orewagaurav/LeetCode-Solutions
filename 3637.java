class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n-1 && nums[i] < nums[i+1]){
            i++;
        }
        int j = i;
        while(i < n-1 && nums[i] > nums[i+1]){
            i++;
        }
        int k = i;
        while(i<n-1 && nums[i]< nums[i+1] ){
            i++;
        }
        int l = i;
        if(0 < j && j < k && k < n-1 && l == n-1){
            return true;
        }
        return false;
    }
}