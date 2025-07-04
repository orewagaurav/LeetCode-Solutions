class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        for(int i:nums){
            hash.add(i);
        }
        for(int i = 1; i<= nums.length;i++){
            if(!hash.contains(i)) {
                list.add(i);
            }
            
        }
        return list;
        

    }
}