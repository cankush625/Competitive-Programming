package linkedin.no_adjacent_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class NoAdjacentRepeat {
	public void noAdjacentRepeat(String input) {
		char[] inputArray = new char[input.length()];
		Map<Character, Integer> max = new HashMap<Character, Integer>();
		int maxVal = 0;
		
		// Copying characters from string to array
		// Also getting the max occured character
		for (int i = 0; i < input.length(); i++) {
			inputArray[i] = input.charAt(i);
			if (max.containsKey(inputArray[i])) {
				max.put(inputArray[i], max.get(inputArray[i])+1);
				if (maxVal < max.get(inputArray[i])) {
					maxVal = max.get(inputArray[i]);
				}
			} else {
				max.put(inputArray[i], 1);
				if (maxVal < max.get(inputArray[i])) {
					maxVal = max.get(inputArray[i]);
				}
			}
		}
		while (Math.floorDiv(maxVal, 2) >= 0) {
			for (int i = 0; i < inputArray.length; i++) {
				// If the current element and the previous element are same then swapping the current element and next element
				// This will solves out problem except for the last element if the last and second last elements are same
				try {
					if ((inputArray[i-1] == inputArray[i]) && (i > 0)) {
						char tempChar = inputArray[i];
						inputArray[i] = inputArray[i + 1];
						inputArray[i + 1] = tempChar;
					}
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				// For last element, checking if the last element and first element are same.
				// If last element and first element are not and last element and second last element are same then swapping the last and first element
				if (i == inputArray.length - 1) {
					if (inputArray[i] == inputArray[i - 1] && inputArray[i] != inputArray[0]) {
						char tempChar = inputArray[i];
						inputArray[i] = inputArray[0];
						inputArray[0] = tempChar;
					}
				}
			}
			maxVal--;
		}
		System.out.println("output:");
		System.out.println(inputArray);
	}
}
