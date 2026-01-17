class Solution {
    int maxPath  = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null){
            return 0;
        }
        DFS(root.left,false,1);
        DFS(root.right,true,1);
        return maxPath;
    }
    private void DFS(TreeNode node,boolean isRight,int length){
        if(node == null)return;
        maxPath = Integer.max(maxPath,length);
        if(isRight){
            DFS(node.left,false,length+1);
            DFS(node.right,true,1);
        }else{
            DFS(node.right,true,length+1);
            DFS(node.left,false,1);
        }
    }
}