package syntax_checking;

import java.util.Stack;

public class SyntaxChecker {
	public boolean syntaxChecker(String array) {
		Stack<Character> stack = new Stack<Character>();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for(int i = 0; i < array.length(); i++) {
			if(array.charAt(i) == '<') {
				one++;
			} else if(array.charAt(i) == '>') {
				two++;
			} else if(array.charAt(i) == '[') {
				three++;
			} else if(array.charAt(i) == ']') {
				four++;
			} else {
				return false;
			}
		}
		
		if (one == two && three == four) {
			for(int i = 0; i < array.length(); i++) {
				if(array.charAt(i) == '<' || array.charAt(i) == '[') {
					stack.push(array.charAt(i));
				}
				
				if(array.charAt(i) == '>' || array.charAt(i) == ']') {
					stack.pop();
				}
			}
		} else {
			return false;
		}
		
		return stack.empty();
	}
}
