package reverse_words_from_string;

public class ReverseWordsFromString {
	public String reverseWords(String sentence, int count) {
		String[] words = sentence.split(" ");
		String reversedSentence = "";
		StringBuilder sen = new StringBuilder();
		for (int i = 0; i < count; i++) {
			String name = words[i];
			StringBuilder sb = new StringBuilder();
			for (int j = name.length()-1; j >= 0; j--) {
				sb.append(name.charAt(j));
			}
			name = sb.toString();
			sen.append(name + " ");
		}
		for (int i = count; i < words.length; i++) {
			sen.append(words[i] + " ");
		}
		reversedSentence = sen.toString();
		return reversedSentence;
	}
	
	public static void main(String[] args) {
		String sentence = "Hello Im Ankush";
		int count = 1;
		ReverseWordsFromString reveresSentence = new ReverseWordsFromString();
		String result = reveresSentence.reverseWords(sentence, count);
		System.out.println(result);
	}
}
