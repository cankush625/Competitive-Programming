class Solution {
    ListNode revList;
    ListNode ans;
	 
	public ListNode reverseList(ListNode head) {
				
		if (head == null) {
			return null;
		}
		
		if (head.next == null) {
			revList = head;
            ans = revList;
			return ans;
		}
		
		reverseList(head.next);
        
        ListNode node = head;
        revList.next = node;
        node.next = null;
        revList = revList.next;
        return ans;
    }
}