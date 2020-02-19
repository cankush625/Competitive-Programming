package cp461_hamming_distance;

class Solution {
    public static int hammingDistance(int x, int y) {
        int sum = 0;
        
        // Run while loop till both x and y becomes 0
        while (x > 0 || y > 0) {
        	// Anding the rightmost bit of x and y with 1
        	if ((x & 1) != (y & 1)) {
        		sum++;
        	}
        	
        	// Right shifting both x and y by one bit
        	x >>= 1;
        	y >>= 1;
        }
        return sum;
    }
}