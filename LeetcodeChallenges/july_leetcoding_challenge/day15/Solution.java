package july_leetcoding_challenge.day15;

import java.util.Stack;

public class Solution {
	public String reverseWords(String s) {
        if (s == null) return null;
        if (s.length() == 0) return "";
        Stack<String> stk = new Stack<String>();
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            if (!sArr[i].equals("")) {
                stk.push(sArr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(" " + stk.pop());
        }
        String result = sb.toString();
        return result.trim();
    }
}
