package airbnb;

import java.util.ArrayList;
import java.util.List;

public class NoOfPalindromes {
	public List<ArrayList<Integer>> noOfPalindromes(List<String> names) {
		// Creating a ArrayList to store a pairs of palindromes of type ArrayList
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		// Iterating through the List of names using forEach
		for (String name: names) {
			String pal = "";
			// Creating the reverse of the name
			for (int i = name.length() - 1; i >= 0; i--) {
				char sepName = name.charAt(i);
				pal = pal + sepName;
			}
					
			// Checking if the list of names contains the reversed name
			if (names.contains(pal)) {
//				System.out.println(names.indexOf(name) + ", " + names.indexOf(pal));
				// Making a pair of the existed palindromes
				List<Integer> pair = new ArrayList<Integer>();
				pair.add(names.indexOf(name));
				pair.add(names.indexOf(pal));
				result.add((ArrayList<Integer>) pair);
			}
		}
		return new ArrayList<ArrayList<Integer>>(result);
	}
}
