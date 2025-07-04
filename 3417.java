class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       List<Integer> lis = new ArrayList<>();
       List<Integer> result = new ArrayList<>();
       for(int i=0;i<m;i++){
            if(i % 2==0){
                for(int j=0;j<n;j++){
                    lis.add(grid[i][j]);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    lis.add(grid[i][j]);
                }
            }
        }  
        for(int i =0;i<lis.size();i+=2){
            result.add(lis.get(i));
       }
       return result; 
    }
}