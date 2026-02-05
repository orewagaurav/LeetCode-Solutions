class Solution {
    public int maxArea(int[] height) {
        int p = 0;
        int q = height.length -1;
        int maxArea = 0;
        while(p < q){
            int length = q - p;
            int breadth = Math.min(height[p] , height[q]); 
            int area = length * breadth;
            maxArea = Math.max(maxArea,area);
            if(height[p] < height[q]){
                p++;
            }else{
                q--;
            }
        }
        return maxArea;
    }
}