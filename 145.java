class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List lis = new ArrayList<>();
        postorder(root,lis);
        return lis;
    }
    private void postorder(TreeNode root,List<Integer> lis){
        if(root!=null){
            postorder(root.left,lis);
            postorder(root.right,lis);
            lis.add(root.val);
        }
    }
}