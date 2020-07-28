package july_leetcoding_challenge.day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) { return new ArrayList(); }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        queue.add(root);
        boolean reverseLevel = false;
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> level = new ArrayList<Integer>();
        	while (size-- > 0) {
        		root = queue.poll();
        		level.add(root.val);
        		if (root.left != null) {
        			queue.add(root.left);
        		}
        		if (root.right != null) {
        			queue.add(root.right);
        		}
        	}
    		if (reverseLevel) {
    			Collections.reverse(level);
    		}
    		result.add(level);
    		reverseLevel = !reverseLevel;
        }
        return result;
    }
}