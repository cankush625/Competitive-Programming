package cp13_roman_to_integer;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
    	HashMap<Character, Integer> romanNums = new HashMap<Character, Integer>();
    	romanNums.put('I', 1);
    	romanNums.put('V', 5);
    	romanNums.put('X', 10);
    	romanNums.put('L', 50);
    	romanNums.put('C', 100);
    	romanNums.put('D', 500);
    	romanNums.put('M', 1000);
    	
    	int decimal = 0;
    	
    	for (int i = s.length() - 1; i >= 0; i--) {
    		if (i < s.length() - 1) {
    			if (romanNums.get(s.charAt(i)) < romanNums.get(s.charAt(i + 1))) {
    				decimal -= romanNums.get(s.charAt(i));
    			} else {
    				decimal += romanNums.get(s.charAt(i));
    			}
    		} else {
    			decimal += romanNums.get(s.charAt(i));
    		}
    	}
    	return decimal;
    }
}