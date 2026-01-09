class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getleaves(root1 , list1);
        getleaves(root2, list2);
        return list1.equals(list2);
    }
    private void getleaves(TreeNode root , List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        getleaves(root.left,list);
        getleaves(root.right,list);
    }
}