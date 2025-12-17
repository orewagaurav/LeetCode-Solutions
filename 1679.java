class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count  = 0;
        for(int i : nums){
            int target = k - i;
            if(map.containsKey(target) && map.get(target) > 0){
                count++;
                map.put(target,map.get(target)-1);
            }else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return count;
    }
}