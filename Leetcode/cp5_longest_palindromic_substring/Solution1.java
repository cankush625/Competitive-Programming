package cp5_longest_palindromic_substring;

public class Solution1 {
	public String longestPalindrome(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];
        int maxStart = 0;
        int maxEnd = 0;
        if (s == "") {
        	return s;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                if (i == 0 || (s.charAt(j) == s.charAt(j + i) && (i == 1 || dp[j + 1][j + i - 1]))) {
                    dp[j][j + i] = true;
                    maxStart = j;
                    maxEnd = j + i;
                }
            }
        }  
        return s.substring(maxStart, maxEnd + 1);
    }
	
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		String str = "";
		
		System.out.println(sol.longestPalindrome(str));		
	}
}
