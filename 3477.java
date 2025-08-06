class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n1 = fruits.length;
        boolean []used = new boolean[n1];
        int unplaced = 0;
        for(int i=0;i<n1;i++){
            boolean placed =false;
            for(int j =0;j<baskets.length;j++){
                if(!used[j] && fruits[i]<= baskets[j]){
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                unplaced++;
            }
        }
        return unplaced;
    }
}