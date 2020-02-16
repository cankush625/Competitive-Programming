package cp7_reverse_integer;

class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
        	int num = x % 10;
        	x = x / 10;
        	
        	// Checking for conditions
        	if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && num > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && num < -8)) return 0;
            
        	rev = rev * 10 + num;
        }
        
        return rev;
    }
}