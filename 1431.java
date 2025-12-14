class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy = 0;
        for(int i :candies){
            if(i> maxcandy){
                maxcandy = i;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i:candies){
            if(i + extraCandies >= maxcandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}