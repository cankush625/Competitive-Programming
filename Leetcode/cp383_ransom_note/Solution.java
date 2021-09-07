class Solution {
    // Time complexity O(n)
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for (int i = 0; i < ransomNote.length(); i++) {
            freq1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            freq2[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            int freq = ransomNote.charAt(i) - 'a';
            if (freq2[freq] < freq1[freq]) {
                return false;
            }
        }
        return true;
    }
}