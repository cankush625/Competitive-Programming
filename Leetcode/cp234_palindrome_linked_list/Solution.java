package cp234_palindrome_linked_list;

import java.util.Stack;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean isPalindrome(ListNode head) {
		Stack<Integer> values = new Stack<Integer>();
		ListNode start = head;
		ListNode start1 = head;
		
		// Adding all the linkedlist values to the stack
	    while (start != null) {
	    	values.push(start.val);
	    	start = start.next;
	    }
	    
	    // While stack is not empty, popping the valeus from stack and comparing for each node of linkedlist and keep traversing linkedlist
	    while (!values.isEmpty()) {
	    	int a = values.pop();
	    	if (a == start1.val) {
	    		start1 = start1.next;
	    	} else if (a != start1.val) {
	    		return false;
	    	}
	    }
	    return true;
	}
}
