class Solution {
    public String reverseWords(String s) {
        String  trimStr = s.trim();
        String[] arr = trimStr.split(" +");
        StringBuilder reversed = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            reversed.append(arr[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}