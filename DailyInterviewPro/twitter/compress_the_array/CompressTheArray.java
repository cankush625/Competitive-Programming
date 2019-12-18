package twitter.compress_the_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompressTheArray {
	public void compressTheArray(char[] array) {
		
		// Creating HashMap to store the result
		Map<Character, Integer> resVal = new HashMap<Character, Integer>();
		List<Object> arr = new ArrayList<Object>();
		
		// Storing the number of occurances of the elements in the array to the resVal HashMap
		for (int i = 0; i < array.length; i++) {
			char element = array[i];
			if (resVal.containsKey(element)) {
				int val = resVal.get(element);
				val++;
				resVal.replace(element, val);
			} else {
				resVal.put(element, 1);
			}
		}
		
		// Getting all the keys from the HashMap
		Set<Character> keys = resVal.keySet();
		@SuppressWarnings("rawtypes")
		Iterator iterator = keys.iterator();
		
		// Adding the keys and value from the resVal HashMap to the arr
		while (iterator.hasNext()) {
			char first = (char) iterator.next();
			arr.add(first);
			if (resVal.get(first) != 1) {
				arr.add(resVal.get(first));
			}
		}
		
		// Displaying the result
		System.out.println(arr);
	}
}
