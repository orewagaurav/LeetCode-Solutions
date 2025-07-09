class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for(int i :nums1){
            set.add(i);
        }
        for(int i :nums2){
            if(set.contains(i)){
                min = Math.min(min,i);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}