class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return root;
        if(root.val < key){
            root.left = deleteNode(root.left,key);
        }else{
            root.right = deleteNode(root.right,key);
        }
        if(root.val  == key){
            if(root.left == null)return root.right;
            if(root.right == null)return root.left;

            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right,minNode.val);
        }
        return root;
    }
    private TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}