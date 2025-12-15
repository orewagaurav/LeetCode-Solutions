class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        for(int i=0;i<len;i++){
            if(n == 0) return true;
            if(flowerbed[i] == 0){
                boolean prevEmpty = (i == 0 || flowerbed[i-1] == 0);
                boolean nextEmpty = (i == len - 1 || flowerbed[i + 1] == 0);
                if(prevEmpty && nextEmpty){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}