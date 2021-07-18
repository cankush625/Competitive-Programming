class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
	// If diameter is passing through the root
        int currentDiameter = calcHeight(root.left) + calcHeight(root.right);
	// Max of the diameter passing through root, left height and right heigh
        return Math.max(currentDiameter, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
    
    private int calcHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(calcHeight(root.left), calcHeight(root.right)) + 1;
    }
}