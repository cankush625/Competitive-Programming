package BinaryTree.HeightBalancedBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class HeightBalancedBinaryTree {
    public TreeNode tree(int[] nums, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            TreeNode root = new TreeNode(nums[middle]);
            root.left = tree(nums, start, middle - 1);
            root.right = tree(nums, middle + 1, end);
            return root;
        }
        return null;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        HeightBalancedBinaryTree heightBalancedBinaryTree = new HeightBalancedBinaryTree();
        int[] nums = {-10, -3, 0, 5, 9};
        System.out.println(heightBalancedBinaryTree.sortedArrayToBST(nums));
    }
}
