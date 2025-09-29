/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lis = new LinkedList<>();
        if(root == null)return lis;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node node = queue.poll();
                level.add(node.val);
                for(Node child:node.children){
                    if(child != null) queue.add(child);
                } 
            }
            lis.add(level);
        }
        return lis;
    }
}