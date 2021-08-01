class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = dummy;
        ListNode nxt = dummy;
        ListNode previous = dummy;
        
        int count = 0;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        
        while (count >= k) {
            current = previous.next;
            nxt = current.next;
            // We have to remove k-1 links and reverse them, so, we will run the loop k-1 times
            for(int i = 1; i < k; i++) {
                current.next = nxt.next;
                nxt.next = previous.next;
                previous.next = nxt;
                nxt = current.next;
            }
            previous = current;
            count -= k;
        }
        
        return dummy.next;
    }
}