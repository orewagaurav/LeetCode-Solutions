class Solution {
    public List<Integer> postorder(Node root) {
        List lis = new ArrayList<>();
        traverse(root,lis);
        return lis;
    }
    private void traverse(Node root , List<Integer> lis){
        if(root ==null)return;
        for(Node child: root.children){
            traverse(child,lis);
        }
        lis.add(root.val);
    }
}