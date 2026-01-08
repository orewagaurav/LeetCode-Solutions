class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int diff = Math.abs(height(root.left) - height(root.right));
        if (diff > 1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}