package google.sort_linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedListManager {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(4);
		linkedList.add(1);
		linkedList.add(-3);
		linkedList.add(99);
		
		Collections.sort(linkedList);
		
		System.out.println(linkedList);
	}
}
