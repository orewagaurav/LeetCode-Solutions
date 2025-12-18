class Solution {
    private boolean isVowel(char c){
        // c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' );
    }
    public int maxVowels(String s, int k) {
        int start = 0;
        int end  = 0;
        int count = 0;
        int maxVowel = 0;
        while(end < s.length()){
            int windowSize = end - start + 1;
            if(isVowel(s.charAt(end))){
                count++;
            }
            if(windowSize < k){
                end++;
            }else{
                maxVowel = Math.max(maxVowel,count);
                if(isVowel(s.charAt(start))){
                    count--;
                }
                start++;
                end++;
            }
        }
        return maxVowel;

    }
}