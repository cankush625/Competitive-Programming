package syntax_checking;

public class SyntaxChecker {
	public boolean syntaxChecker(String array) {
		boolean flag = false;
		
		for (int i = 0; i < ((array.length()) / 2); i++) {
			if (array.charAt(i) == '<' && array.charAt(array.length() - (i + 1)) == '>') {
				flag =  true;
			} else if (array.charAt(i) == '[' && array.charAt(array.length() - (i + 1)) == ']') {
				flag =  true;
			} else {
				flag = false;
			}
		}
		
		return flag;
	}
}
