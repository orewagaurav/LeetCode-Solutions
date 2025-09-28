class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List lis = new ArrayList<>();
        preorder(root,lis);
        return lis;
    }
    private void preorder(TreeNode root, List<Integer> lis){
        if(root != null){
            lis.add(root.val);
            preorder(root.left,lis);
            preorder(root.right,lis);
        }
    }
}