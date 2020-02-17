package pattern_searching_using_naive_algorithm;

/**
 * @author cankush
 *
 * Problem:
 * 	In the given text find the matching pattern and for each occurance of the pattern print the starting index
 */
public class PatternSearching {
	public static void searchPattern(String text, String pattern) {
		int m = text.length();
		int n = pattern.length();
		// A loop to traverse through string and search for pattern
		for (int i = 0; i <= m - n; i++) {
			int j;
			// For current index i check for pattern match
			for (j = 0; j < n; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			if (j == n) {
				System.out.println("Pattern found at index: " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		searchPattern("ABABBBABABBBABBABBBABB", "ABAB");
	}
}
