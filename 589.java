class Solution {
    public List<Integer> preorder(Node root) {
      List<Integer> lis = new ArrayList<>();
      traverse(root,lis);
      return lis;  
    }
    private void traverse(Node root,List<Integer> lis){
        if(root ==null)return;
        lis.add(root.val);
        for(Node child:root.children){
            traverse(child,lis);
        }
    }
}