class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int max = 0;
        int []lMax = new int[n];
        int []rMax = new int[n];
        
        for(int i=0;i<n;i++){
            if(height[i]>max){
                max = height[i];
            }
            lMax[i] = max;
        }
        max = 0;
        for(int i=n-1;i>=0;i--){
            if(height[i]>max){
                max = height[i];
            }
            rMax[i] = max;
        }
        for(int i=0;i<n;i++){
            water += Math.min(lMax[i],rMax[i]) - height[i];
        }
        return water;
        
    }
}