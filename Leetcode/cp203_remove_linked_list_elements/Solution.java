class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) { return null; }
        ListNode temp = head;
        ListNode p = temp;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return temp.val == val ? temp.next:temp;
    }
}