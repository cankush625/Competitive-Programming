class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n > sizeOfLinkedList(head)) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListNode tempHead = head;
        while (tempHead != null) {
            arrayList.add(tempHead.val);
            tempHead = tempHead.next;
        }
        int size = arrayList.size();
        int del = size - n;
        arrayList.remove(del);
        // Starting the answer LinkedList with random element -1
        // Our answer will start from second node
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        for (int i : arrayList) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return newHead.next;
    }
    
    private int sizeOfLinkedList(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}