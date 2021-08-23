class Solution {
    // Time complexity O(n*logn)
    // Space complexity O(n) where n = number of nodes in BST
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arrayList = new ArrayList<Integer>();
        getNodes(root, arrayList);
        Collections.sort(arrayList);
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