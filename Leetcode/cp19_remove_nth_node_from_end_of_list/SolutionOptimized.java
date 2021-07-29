class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
         
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode slow = newHead;
        ListNode fast = newHead;
        
        // Move fast forward so that gap between slow and fast becomes n
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        
        // After exiting this loop, the slow is at the node just before the node we have to remove
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return newHead.next;
    }
}