package cp206_reverse_linked_list;

public class Solution {
	
	ListNode revList;
	 
	public ListNode reverseList(ListNode head) {
				
		if (head == null) {
			return null;
		}
		
		if (head.next == null) {
			revList = head;
			return revList;
		}
		
		reverseList(head.next);
		
		// Reversing the linked list
		ListNode q = head.next;
        q.next = head;
        head.next = null;
		return revList;
    }
}
