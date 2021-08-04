class Solution {
    // Time complexity O(n)
    // Space Complexity O(Height of Tree)
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return ans;
        }
        
        Deque<Integer> array = new LinkedList<Integer>();
        
        findPaths(root, targetSum, array, ans);

        return ans;
    }
    
    // Find the paths from root to the leaf node. And if the path length is equal to the targetSum then add the path to the paths list
    private void findPaths(TreeNode root, int targetSum, Deque<Integer> currentList, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }
        
        currentList.addLast(root.val);
        
        if (root.left == null && root.right == null) {
            int sum = 0;
            for (Integer i : currentList) {
                sum += i;
            }
            if (sum == targetSum) {
                List<Integer> lst = new ArrayList<Integer>();
                for (Integer i : currentList) {
                    lst.add(i);
                }
                // Add the current array list of nodes values to the paths list
                paths.add(new ArrayList<Integer>(lst));
            }
        }
        
        if (root.left != null) {
            findPaths(root.left, targetSum, currentList, paths);
        }
        
        if (root.right != null) {
            findPaths(root.right, targetSum, currentList, paths);
        }
        
        currentList.removeLast();
    }
}