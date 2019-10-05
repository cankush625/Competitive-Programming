package syntax_checking;

import java.util.Stack;

public class SyntaxChecker {
	public boolean syntaxChecker(String array) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < array.length(); i++) {
			if(array.charAt(i) == '<' || array.charAt(i) == '[') {
				stack.push(array.charAt(i));
			}
			
			if(array.charAt(i) == '>' || array.charAt(i) == ']') {
				stack.pop();
			}
		}
		
		return stack.empty();
	}
}
