class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 0) {
            return null;
        }
        if (k == 1) {
            return head;
        }
        ListNode temp = head;
        // Create random node to initialize the answer linked list
        ListNode newHead = new ListNode(-1);
        ListNode tempList = newHead;
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        while (i < k && temp != null) {
            arrayList.add(temp.val);
            temp = temp.next;
            i++;
            if (i == k) {
                Collections.reverse(arrayList);
                for (int num : arrayList) {
                    tempList.next = new ListNode(num);
                    tempList = tempList.next;
                }
                arrayList = new ArrayList<Integer>();
                i = 0;
            }
        }
        // Adding the remaining last nodes of the linkedlist
        // Because condition at line 24 only checks and add the nodes if i == k
        // But for last elements the i will be less than k
        for (int num : arrayList) {
            tempList.next = new ListNode(num);
            tempList = tempList.next;
        }
        return newHead.next;
    }
}