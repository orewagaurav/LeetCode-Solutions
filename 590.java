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

// OR

// class Solution {
//     public List<Integer> postorder(Node root) {
//         LinkedList<Integer> res = new LinkedList<>();
//         if(root==null)return res;
//         Stack<Node> stack = new Stack<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             Node tmp = stack.pop();
//             res.addFirst(tmp.val);
//             for(Node child:tmp.children){
//                 stack.push(child);
//             }
//         }
//         return res;
//     }
// }