package twitter.convert_roman_to_decimal;

import java.util.HashMap;

public class RomanToDecimal {
	public void romanDecimal(String romanNum) {
		
		// Adding all the decimal values of the basic Roman numbers in the hashmap
		HashMap<String, Integer> romanNums = new HashMap<String, Integer>();
		romanNums.put("I", 1);
		romanNums.put("IV", 4);
		romanNums.put("V", 5);
		romanNums.put("IX", 9);
		romanNums.put("X", 10);
		romanNums.put("XL", 40);
		romanNums.put("L", 50);
		romanNums.put("XC", 90);
		romanNums.put("C", 100);
		romanNums.put("CD", 400);
		romanNums.put("D", 500);
		romanNums.put("CM", 900);
		romanNums.put("M", 1000);
		
		// Initializing the variable to store the decimal value of the roman number
		int decimalValue = 0;
		
		// Copying all the characters in the roman number to the char array
		char[] individualRomanNum = new char[romanNum.length()];
		
		for (int i = 0; i < romanNum.length(); i++) {
			individualRomanNum[i] = romanNum.charAt(i);
		}
		
		for (int i = 0; i < individualRomanNum.length; i++) {
			// Taking the single character from the roman number
			String romanSingleLetter = Character.toString(individualRomanNum[i]);
			String romanSecondLetter = null;
			// Taking the second character from the roman number
			if (i < individualRomanNum.length - 1) {
				romanSecondLetter = Character.toString(individualRomanNum[i+1]);
			}
			// Making the string of the two consecutive characters in the roman number and checking if they are present in the stored HashMap of the characters and values
			StringBuilder romanDoubleLetter = new StringBuilder();
			romanDoubleLetter.append(romanSingleLetter);
			romanDoubleLetter.append(romanSecondLetter);
			// Converting the romanDoubleLetter from StringBuilder to String to use it to check for key in the HashMap
			String romanDoubleLetter_ = romanDoubleLetter.toString();
			
			// If the double letter String is present in the HashMap then taking the value of that character else taking the value of the single character
			if (romanNums.containsKey(romanDoubleLetter_)) {
				//
				decimalValue = decimalValue + romanNums.get(romanDoubleLetter_);
				System.out.println(decimalValue);
				i++;
				
			} else {
				decimalValue = decimalValue + romanNums.get(romanSingleLetter);
				System.out.println(decimalValue);
			}
		}
		
		// Displaying the decimal equivalent of the Roman number
		System.out.println("The Decimal value of the Roman number " + romanNum + " is " + decimalValue);
	}
}
