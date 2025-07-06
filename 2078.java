class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int dist1 = 0;
        int dist2 =0;
        
        for(int i=0;i<n;i++){
            if(colors[i] != colors[n-1]){
                dist1 = n-1-i;
                break;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(colors[j] != colors[0]){
                dist2 = j;
                break;
            }
        }
        return Math.max(dist1,dist2);
    }
}