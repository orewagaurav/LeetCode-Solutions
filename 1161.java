class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int tempLevel = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int sum = 0;
            tempLevel++;
            int size = queue.size();
            for(int i =0;i < size;i++){
                if(queue.peek().left != null)queue.offer(queue.peek().left);
                if(queue.peek().right != null)queue.offer(queue.peek().right);
                sum += queue.poll().val;
            }
            if(maxSum < sum){
                level = tempLevel;
                maxSum = sum;
            }
        }
        return level;
    }
}