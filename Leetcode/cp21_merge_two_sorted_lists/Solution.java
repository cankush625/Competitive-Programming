package cp21_merge_two_sorted_lists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	// Handle empty lists
        if (l1 == null && l2 == null) return null;
        else if (l1 == null && l2 != null) return l2;
        else if (l2 == null && l1 != null) return l1;
        else {
            ListNode finalList = new ListNode(0);
            // Pointer to the mergedList
            ListNode mergedList = finalList;
            
            // Get the least value from the two lists
            if (l1.val < l2.val) {
                mergedList.val = l1.val;
                l1 = l1.next;
            } else {
                mergedList.val = l2.val;
                l2 = l2.next;
            }
            
            // Traversing till the end of both lists
            while(l1 != null || l2 != null) {
            	if (l1 == null && l2 != null) {
            		mergedList.next = l2;
            		mergedList = l2;
            		l2 = l2.next;
            	} else if (l2 == null && l1 != null) {
            		mergedList.next = l1;
            		mergedList = l1;
            		l1 = l1.next;
            	} else {
            		int val1 = l1.val;
            		int val2 = l2.val;
            		
            		if (val1 < val2) {
            			mergedList.next = l1;
            			mergedList = l1;
            			l1 = l1.next;
            		} else {
            			mergedList.next = l2;
            			mergedList = l2;
            			l2 = l2.next;
            		}
            	}
            }
            return finalList;
        }
    }
}