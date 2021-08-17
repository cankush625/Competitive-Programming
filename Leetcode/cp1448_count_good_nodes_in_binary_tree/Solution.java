class Solution {    
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = goodNodesCount(root, Integer.MIN_VALUE);
        return count;
    }
    
    private static int goodNodesCount(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int count = root.val >= max ? 1 : 0;
        count += goodNodesCount(root.left, Math.max(max, root.val));
        count += goodNodesCount(root.right, Math.max(max, root.val));
        return count;
    }
}