package july_leetcoding_challenge.day10;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    
    Node(int val) {
    	this.val = val;
    }
};

public class Solution {
	List<Integer> flatVals = new ArrayList<Integer>();
    
    public void dfs(Node head) {
        if (head == null) return;
        flatVals.add(head.val);
        dfs(head.child);
        dfs(head.next);
    }
    
    public Node flatten(Node head) {
        if (head == null) return null;
        dfs(head);
        int index = 0;
        Node flattenHead = new Node(flatVals.get(index));
        Node temp = flattenHead;
        index++;
        while (index < flatVals.size()) {
            Node temp1 = new Node(flatVals.get(index));
            temp.next = temp1;
            temp1.prev = temp;
            temp = temp1;
            index++;
        }
        return flattenHead;
    }
}
