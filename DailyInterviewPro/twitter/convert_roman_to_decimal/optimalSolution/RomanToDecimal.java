package twitter.convert_roman_to_decimal.optimalSolution;

import java.util.HashMap;

public class RomanToDecimal {
	public void romanToDecimal(String romanNum) {
		
		// Adding all the decimal values of the basic Roman numbers in the hashmap
		HashMap<Character, Integer> romanNums = new HashMap<Character, Integer>();
		romanNums.put('I', 1);
		romanNums.put('V', 5);
		romanNums.put('X', 10);
		romanNums.put('L', 50);
		romanNums.put('C', 100);
		romanNums.put('D', 500);
		romanNums.put('M', 1000);
		
		int decimalNum = 0;
				
		for (int i = 0; i < romanNum.length(); i++) {
			 if (i == romanNum.length() - 1) {
				decimalNum = decimalNum + romanNums.get(romanNum.charAt(i));
			} else if (romanNums.get(romanNum.charAt(i)) > romanNums.get(romanNum.charAt(i+1)) || romanNums.get(romanNum.charAt(i)) == romanNums.get(romanNum.charAt(i+1))) {
				decimalNum = decimalNum + romanNums.get(romanNum.charAt(i));
			} else if (romanNums.get(romanNum.charAt(i)) < romanNums.get(romanNum.charAt(i+1))) {
				decimalNum = decimalNum - romanNums.get(romanNum.charAt(i));
			}
		}
		
		System.out.println("Decimal equivalent of " + romanNum + " is " + decimalNum);
	}
}
