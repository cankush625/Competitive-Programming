class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            String temp = patterns[i];
            if (word.contains(temp)) {
                count++;
            }
        }
        return count;
    }
}