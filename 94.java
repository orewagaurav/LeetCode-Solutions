class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List lis =new ArrayList<>();
        if(root != null) {
            lis.addAll(inorderTraversal(root.left));
            lis.add(root.val);
            lis.addAll(inorderTraversal(root.right));
        }
        return lis;
    }
}