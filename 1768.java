class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i<len1 && j<len2){
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        while(i < len1){
            merged.append(word1.charAt(i++));
        }
        while(j < len2){
            merged.append(word2.charAt(j++));
        }
        return merged.toString();
    }
}