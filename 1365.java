class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []sorted = nums.clone();
        Arrays.sort(sorted);
        int []arr = new int[nums.length];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int sol = sorted[i];
            if(!map.containsKey(sol)){
                map.put(sorted[i],i);
            }
        }
        for(int i =0;i<n;i++){
            arr[i] = map.get(nums[i]);
        }
        return arr;


    }
}