class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public int minFlipsMonoIncr(String s) {
        if (s == null) {
            return 0;
        }
        
        int i = 0;
        int len = s.length();
        int numOfOnes = 0;
        int numOfZeros = 0;
        // Move forward till we have zeros from the start
        while (i < len && s.charAt(i) == '0') {
            i++;
        }
        // Count number of zeros and number of one's. Ar any point, if number of zeros are greater than number
        // of one's then set number of zeros to number of one's
        // Here, numOfZeros acts like a flipCount. It indicates how many flips we have to make.
        while (i < len) {
            char c = s.charAt(i);
            if (c == '0') {
                numOfZeros++;
            } else {
                numOfOnes++;
            }
            if (numOfZeros > numOfOnes) {
                numOfZeros = numOfOnes;
            }
            i++;
        }
        return numOfZeros;
    }
}