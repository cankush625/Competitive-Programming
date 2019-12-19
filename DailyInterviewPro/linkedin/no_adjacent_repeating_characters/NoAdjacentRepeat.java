package linkedin.no_adjacent_repeating_characters;

public class NoAdjacentRepeat {
	public void noAdjacentRepeat(String input) {
		char[] inputArray = new char[input.length()];
		
		// Copying characters from string to array
		for (int i = 0; i < input.length(); i++) {
			inputArray[i] = input.charAt(i);
		}
		
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
		System.out.println("output:");
		System.out.println(inputArray);
	}
}
