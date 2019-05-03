//Detect a cycle in the linked list. Note that the head pointer may be 'null' if the list is empty.

package LinkedList;

public class CyclesInLinkedList {

    static class node{
        int data;
        node next;
        node prev;

        private node(int data){
            this.data = data;
        }
    }

    private static boolean hasCycles(node head){
        if (head == null){
            return false;
        }

        node fast = head.next;
        node slow = head;
        while(fast != null && fast.next != null && slow != null){
            if (fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args){
        node head = new node(2);
        node nodeB = new node(3);
        node nodeC = new node(5);
        node nodeD = new node(7);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeB.prev = head;
        nodeC.next = nodeD;
        nodeC.prev = nodeB;
        nodeD.next = head;
        nodeD.prev = nodeC;

        System.out.println(hasCycles(head));
    }
}

// by Ankush Chavan

/*
Output :
    true
*/