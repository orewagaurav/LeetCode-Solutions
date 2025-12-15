class Solution {
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while(left < right){
            while(left < right && !isVowel(charArr[left])){
                left++;
            }
            while(left < right && !isVowel(charArr[right])){
                right--;
            }
            if(left < right){
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArr);
    }
}