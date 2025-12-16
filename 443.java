class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i = 0;
        while(i < n){
            int j = i;
            while(j<n && chars[i] == chars[j]) j++;
            chars[write++] = chars[i];
            int count = j-i;
            if(count > 1){
                String strNum = String.valueOf(count);
                for(int k=0;k<strNum.length();k++){
                    chars[write++] = strNum.charAt(k);
                }
            }
            i = j;
        }
        return write;
    }
}