class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) continue;
                stack.pop();
            }
        }
        for(char i:stack){
            str.append(i);
        }
        return str.toString();
    }
}