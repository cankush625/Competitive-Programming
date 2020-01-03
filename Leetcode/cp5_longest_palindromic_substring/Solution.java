package cp5_longest_palindromic_substring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String longestPalindrome(String s) {
		List<String> palindromes = new ArrayList<String>();
		int max = 0;
		String maxString = "";
		
        for (int i = 0; i < s.length(); i++) {
        	StringBuilder sb = new StringBuilder();
        	for (int j = i; j < s.length(); j++) {
        		sb.append(s.charAt(j));
        		if (isPalindrome(sb.toString())) {
        			palindromes.add(sb.toString());
        		}
        	}
        }
        
        for (int i = 0; i < palindromes.size(); i++) {
        	if (palindromes.get(i).length() > max) {
        		max = palindromes.get(i).length();
        		maxString = palindromes.get(i);
        	}
        }
        return maxString;
    }
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		String palStr = sb.toString();
		if (palStr.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String str = "";
		
		System.out.println(sol.longestPalindrome(str));		
	}
}
