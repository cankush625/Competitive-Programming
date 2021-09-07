class Solution {
    // Time complexity O(n)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--frequency[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}