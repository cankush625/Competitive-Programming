class Solution {
    long ans = 0;
    long totalSum = 0;
    
    // Time complexity O(2n) = O(n)
    // Space complexity O(n) - stack depth of recursion
    public int maxProduct(TreeNode root) {
        // The first pass of dfs(root) will give us the total sum of the whole tree
        totalSum = dfs(root);
        // The second pass of the dfs(root) will help in calculating the sum of each subtree and finding max
        dfs(root);
        return (int) (ans % (1e9+7));
    }
    
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currentSum = root.val + dfs(root.left) + dfs(root.right);
        ans = Math.max(ans, (totalSum - currentSum) * currentSum);
        return currentSum;
    }
}