package facebook.find_shortest_transformation_from_one_word_to_another;

import java.util.ArrayList;
import java.util.List;

public class ShortestTransformation {
	public List<String> shortestTransformation(String start, String end, List<String> dictionary) {
		char[] startArray = new char[start.length()];
		char[] endArray = new char[end.length()];
		
		List<String> resultDictionary = new ArrayList<String>();
		
		// Stroring the characters from the start string into the startArray
		for (int i = 0; i < start.length(); i++) {
			startArray[i] = start.charAt(i);
		}
		
		// Stroring the characters from the end string into the endArray
		for (int i = 0; i < end.length(); i++) {
			endArray[i] = end.charAt(i);
		}
		
		int endArrayLength = endArray.length;
		// Adding the start word to the dictionary
		resultDictionary.add(start);
		for (int i = 0; i < startArray.length; i++) {
			// Creating the string builder to form the word for checking if it is present in the dictionary
			StringBuilder word = new StringBuilder();
			
			// Forming the word by replacing the last characters of start word that of the end word
			for (int j = 0; j < endArray.length; j++) {
				if (j < endArrayLength - 1) {
					word.append(startArray[j]);
				} else {
					word.append(endArray[j]);
				}
			}
			
			String word_ = word.toString();
			endArrayLength--;
			// If the dictionary contains the word_ and also the word_ is not already present in the result dictionary then the word is get added to the result dictionary
			if (dictionary.contains(word_)) {
				if (!resultDictionary.contains(word_)) {
					resultDictionary.add(word_);
				}
			} else {
				// If the word_ is not present in the dictionary then return the null
				return null;
			}
		}
		
		// Displaying the output
		if (resultDictionary.contains(start) && resultDictionary.contains(end)) {
//			System.out.println(resultDictionary);
			return resultDictionary;
		} else {
			return null;
		}
		
	}
}
