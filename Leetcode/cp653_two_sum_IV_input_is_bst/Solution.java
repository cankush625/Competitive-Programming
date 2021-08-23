class Solution {
    // Time complexity O(n) where n = number of nodes in BST
    // Space complexity O(n) where n = number of nodes in BST
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arrayList = new ArrayList<Integer>();
        // Inorder traversal of BST gives elements in sorted order
        getNodes(root, arrayList);
        int start = 0;
        int end = arrayList.size() - 1;
        while (start < end) {
            int sum = arrayList.get(start) + arrayList.get(end);
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
    
    private void getNodes(TreeNode root, List<Integer> arrayList) {
        if (root == null) {
            return;
        }
        getNodes(root.left, arrayList);
        arrayList.add(root.val);
        getNodes(root.right, arrayList);
    }
}