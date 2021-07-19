class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
	// Create a min heap and add all elements of the lists to this heap
        PriorityQueue<Integer> sortedList = new PriorityQueue<Integer>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                ListNode head = lists[i];
                while (head != null) {
                    sortedList.offer(head.val);
                    head = head.next;
                }
            }
        }
        
        if (sortedList.isEmpty()) {
            return null;
        }
        
        ListNode newList = new ListNode(sortedList.poll());
        ListNode temp = newList;
        
        while (!sortedList.isEmpty()) {
            temp.next = new ListNode(sortedList.poll());
            temp = temp.next;
        }
        
        return newList;
    }
}