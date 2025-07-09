class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        List<Integer> lis = new ArrayList<>();

        for(int i :nums1){
            hMap.put(i,hMap.getOrDefault(i,0)+1);
        }
        for(int i :nums2){
            if(hMap.containsKey(i) && hMap.get(i)> 0){
                lis.add(i);
                hMap.put(i,hMap.get(i)-1);
            }
        }
        int []result = new int[lis.size()];
        int index = 0;
        for(int i :lis){
            result[index++] = i;
        }
        return result;
    }
}