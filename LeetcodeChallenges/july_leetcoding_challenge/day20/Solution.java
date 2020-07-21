package july_leetcoding_challenge.day20;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
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