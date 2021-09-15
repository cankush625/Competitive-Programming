class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        traversBST(root, traversal);
        for(int i = 1; i < traversal.size(); i++) {
            if (traversal.get(i-1) >= traversal.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    private static void traversBST(TreeNode root, List<Integer> traversal) {
        if (root == null) {
            return;
        }
        traversBST(root.left, traversal);
        traversal.add(root.val);
        traversBST(root.right, traversal);
    }
}