class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1)set1.add(i);
        for(int i:nums2)set2.add(i);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for(int i:set1){
            if(!set2.contains(i)){
                result.get(0).add(i);
            }
        }
        for(int i :set2){
            if(!set1.contains(i)){
                result.get(1).add(i);
            }
        }
        return result;

    }
}