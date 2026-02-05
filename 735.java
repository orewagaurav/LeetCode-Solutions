class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(stack.isEmpty() || asteroids[i] > 0) stack.push(asteroids[i]);
            else{
                int val = stack.peek();
                int bomb  = Math.abs(asteroids[i]);
                if(val < 0){
                    stack.push(asteroids[i]);
                }else{
                    while(val <= bomb){
                        if(val == bomb){
                            stack.pop();
                            break;
                        }else if(val < 0){
                            stack.push(asteroids[i]);
                            break;
                        }
                        stack.pop();
                        if(!stack.isEmpty()){
                            val = stack.peek();
                        }else{
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] nums = new int[stack.size()];
        int index = 0;
        for(int num : stack){
            nums[index++] = num;
        }
        return nums;
    }
}   