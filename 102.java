class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lis = new LinkedList<>();
        if (root == null)
            return lis;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            lis.add(level);
            
        }
        return lis;
    }
}