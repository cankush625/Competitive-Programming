package reverse_middle_words_from_string;

public class ReverseMiddleWords {
	public String reverseMiddleWords(String sentence) {
		boolean firstSpace = false;
		boolean lastSpace = false;
		int ptr1 = 0;
		int ptr2 = sentence.length() - 1;
		while (!firstSpace) {
			if (sentence.charAt(ptr1) == ' ') {
				ptr1++;
				break;
			} else {
				ptr1++;
			}
		}
		
		while (!lastSpace) {
			if (sentence.charAt(ptr2) == ' ') {
				ptr2--;
				break;
			} else {
				ptr2--;
			}
		}
		
		StringBuilder sb = new StringBuilder(sentence);
		
		while (ptr1 < ptr2) {
			char first = sentence.charAt(ptr1);
			char second = sentence.charAt(ptr2);
			sb.setCharAt(ptr1, second);
			sb.setCharAt(ptr2, first);
			ptr1++;
			ptr2--;
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ReverseMiddleWords reverseMiddleWords = new ReverseMiddleWords();
		System.out.println(reverseMiddleWords.reverseMiddleWords("This is Ankush"));
	}
}
