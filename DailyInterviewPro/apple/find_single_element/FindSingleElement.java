package Apple.find_single_element;

import java.util.ArrayList;
import java.util.List;

public class FindSingleElement {
	public void findSingleElement(int[] arr) {
		List<Integer> arr1 = new ArrayList<Integer>();
		
		// Making ArrayList from array
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			arr1.add(num);
		}
		System.out.println(arr1);
		
		for (int i = 0; i < arr1.size() - 1; i++) {
			int num = arr1.get(i);
			// Removing the number from the ArrayList to avoid checking for it
			arr1.remove(arr1.get(i));
			// Checking if the ArrayList contains the number after removing it from the ArrayList
			if (arr1.contains(num)) {
				System.out.println();
			} else {
				// Displaying the single element in the ArrayList
				System.out.println("The single element in the array is: " + arr1.get(i));
			}
		}
	}
}
