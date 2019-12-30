package cp3_longest_substring_without_repeating_characters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        List<ArrayList<Character>> subStrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
        	ArrayList<Character> chars = new ArrayList<>();
        	for (int j = i; j < s.length(); j++) {
                if (chars.contains(s.charAt(j))) {
                    break;
                } else {
                    if (chars.contains(s.charAt(j)) == false ) {
                        chars.add(s.charAt(j));
                    }
                }
        	}
        	subStrings.add(chars);
            System.out.println(chars);
        }
        
        int max = 0;
        for (int i = 0; i < subStrings.size(); i++) {
        	if (subStrings.get(i).size() > max) {
        		max = subStrings.get(i).size();
        	}
        }
        return max;
    }
}
