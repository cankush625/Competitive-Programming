class Solution {
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
        
        head.next.next = head;
        head.next = null;
        return revList;
    }
}