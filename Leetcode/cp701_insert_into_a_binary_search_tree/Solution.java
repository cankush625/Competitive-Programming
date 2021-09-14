class Solution {
    // Time Complexity O(logn)
    // Space Complexity O(1)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode temp = root;
        insert(temp, val);
        return root;
    }
    
    public void insert(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (root.val >= val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            }
            insertIntoBST(root.left, val);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            }
            insertIntoBST(root.right, val);
        }
    }
}