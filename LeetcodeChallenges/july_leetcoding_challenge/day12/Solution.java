package july_leetcoding_challenge.day12;

public class Solution {
	public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
        	// Get the right most bit
        	int temp = n & 1;
        	// Shift the rightmost bit to the left
        	int revTemp = temp << (31 - i);
        	// Take OR of the revTemp with the result
        	result = result | revTemp;
        	n >>= 1;
        }
        return result;
    }
}
