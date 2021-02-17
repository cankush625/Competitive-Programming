package BinaryTree.LinkedListToHeightBalancedBinaryTree;

// Leetcode 109

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class LinkedListToHeightBalancedBinaryTree {
    TreeNode tree(List<Integer> arrayList, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            TreeNode root = new TreeNode(arrayList.get(middle));
            root.left = tree(arrayList, start, middle - 1);
            root.right = tree(arrayList, middle + 1, end);
            return root;
        }
        return null;
    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arrayList = new ArrayList<>();
        while(head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        return tree(arrayList, 0, arrayList.size() - 1);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-10);
        LinkedListToHeightBalancedBinaryTree convertToHeightBalancedBinaryTree = new LinkedListToHeightBalancedBinaryTree();
        System.out.println(convertToHeightBalancedBinaryTree.sortedListToBST(head));
    }
}