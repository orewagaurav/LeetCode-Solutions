class Solution {
    public int goodNodes(TreeNode root) {
        return calculateGoodNodes(root , root.val);
    }
    private int calculateGoodNodes(TreeNode root , int max){
        if(root == null) return 0;
        int count = 0;
        if(root.val >= max){
            count = 1;
        }
        max = Math.max(root.val , max);
        count += calculateGoodNodes(root.left,max);
        count += calculateGoodNodes(root.right,max);
        return count;
    }
}