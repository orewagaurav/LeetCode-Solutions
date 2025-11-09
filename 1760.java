class Solution {
    public boolean isPossible(int[] nums, int maxOperations,int mid){
        long operationNeeded = 0;
        for(int i : nums){
            operationNeeded += (i - 1)/mid;
        }
        return operationNeeded <= maxOperations;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int max = Integer.MIN_VALUE;
        int min = 1;
        for(int i:nums){
            max = Integer.max(max,i);
        }
        int ans = max;
        while(min <= max){
            int mid  = min + (max-min)/2;
            if(isPossible(nums,maxOperations,mid)){
                ans  = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }
}