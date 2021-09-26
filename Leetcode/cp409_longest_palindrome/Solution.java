class Solution {
    // Time complexity O(n)
    // Space complexity O(n)
    public int longestPalindrome(String s) {
        char[] sChars = s.toCharArray();
        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        int maxLength = 0;
        boolean isOdd = false;
        // Get count of all characters in the String s
        for (char c : sChars) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // All of the character with even count will be present in the palindrome and
        // all of the characters with odd count will be present with count - 1 characters.
        // If character with odd count present then we will add +1 to the maxLength
        for (Character key : charCount.keySet()) {
            int val = charCount.get(key);
            if (val % 2 == 0) {
                maxLength += val;
            } else {
                maxLength += val - 1;
                isOdd = true;
            }
        }
        if (isOdd) {
            maxLength++;
        }
        return maxLength;
    }
}