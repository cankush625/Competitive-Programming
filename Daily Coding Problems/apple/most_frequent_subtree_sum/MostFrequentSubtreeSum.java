package apple.most_frequent_subtree_sum;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

// Problem:
// Given a root of a binary tree, find the most frequent subtree sum. The subtree sum of a node is the sum of all values under a node, including the node itself.
// Eg. Given the following tree:
//     5
//    / \
//   2  -5
// Return 2 as it occurs twice: Once as the left leaf (0 + 2 + 0), and once as the sum of 2 + 5 - 5.

public class MostFrequentSubtreeSum {
	Map<Integer, Integer> subtreeSum = new HashMap<Integer, Integer>();
	
	private int subtreeSum(Node root) {
		if (root == null) {
			return 0;
		}
		int sum = root.value + subtreeSum(root.left) + subtreeSum(root.right);
		if (!subtreeSum.containsKey(sum)) {
			subtreeSum.put(sum, 1);
		} else {
			int val = subtreeSum.get(sum);
			val++;
			subtreeSum.put(sum, val);
		}
		return sum;
	}
	
	private int mostFrequentSubtreeSum(Node root) {
		subtreeSum(root);
		int maxValue = Collections.max(subtreeSum.values());
		int frequentSum = 0;
		for (Map.Entry<Integer, Integer> map : subtreeSum.entrySet()) {
			if (map.getValue() == maxValue) {
				frequentSum = map.getKey();
			}
		}
		return frequentSum;
	}
	
	public static void main(String[] args) {
		MostFrequentSubtreeSum mostFrequentSubtreeSum = new MostFrequentSubtreeSum();
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(-5);
		System.out.println(mostFrequentSubtreeSum.mostFrequentSubtreeSum(root));
	}
}
