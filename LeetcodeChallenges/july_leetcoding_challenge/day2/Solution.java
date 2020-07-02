package july_leetcoding_challenge.day2;
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		// List of lists that will return the result
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
        
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			// List that will store the values of the nodes in the current level
			List<Integer> currLevel = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.remove();
				currLevel.add(current.val);
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			result.add(currLevel);
		}
		// Returning the final result by reversing the result list
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		for (int i = result.size()-1; i >= 0; i--) {
			finalResult.add(result.get(i));
		}
		return finalResult;
    }
}
