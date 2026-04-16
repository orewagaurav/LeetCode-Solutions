class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int j=0;
        int last = 0;
        while(i>=0){
            if(s.charAt(i) == ' ' )i--;
            else{
                j=i;
                break;
            }
        }
        if(j== -1 )return 0;
        while(j>=0){
            if(s.charAt(j) != ' '){
                last++;
                j--;
            }else{
                break;
            }
        }
        return last;
    }
}