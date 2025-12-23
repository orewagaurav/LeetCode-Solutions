class Solution {
    public int equalPairs(int[][] grid) {
        int n  =  grid.length;
        int count = 0;
        HashMap<List<Integer>,Integer> rowMap = new HashMap<>();
        for(int[] row:grid){
            List<Integer> rowList = new ArrayList<>();
            for(int val :row){
                rowList.add(val);
            }
            rowMap.put(rowList,rowMap.getOrDefault(rowList,0)+1);
        }
        for(int c =0;c<n;c++){
            List<Integer> colList = new ArrayList<>();
            for(int r=0;r<n;r++){
                colList.add(grid[r][c]);
            }
            if(rowMap.containsKey(colList)){
                count += rowMap.get(colList);
            }
        }
        return count;
    }
}