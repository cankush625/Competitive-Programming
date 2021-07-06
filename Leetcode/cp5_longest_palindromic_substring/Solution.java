class Solution {
    private int start = 0;
    private int maxLen = 0;
    
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        // Try to extend palindrome as much as possible from current character
        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i); // assume odd length
            extendPalindrome(s, i, i+1); // assume even length
        }
        return s.substring(start, start + maxLen);
    }
    
    private void extendPalindrome(String word, int low, int high) {
        while (low >= 0 && high < word.length() && word.charAt(low) == word.charAt(high)) {
            low--;
            high++;
        }
        // For maxlen, we are doing -1 because the value of low is one minus the actual index of start of palindrome and value of high is one plus the actual index of end of palindrome
        if (maxLen < high - low - 1) { 
            start = low + 1;
            maxLen = high - low - 1;
        }
    }
}