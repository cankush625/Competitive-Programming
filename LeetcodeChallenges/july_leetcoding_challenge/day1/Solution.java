package july_leetcoding_challenge.day1;

public class Solution {
	public int arrangeCoins(int n) {
        int count = 0;
        int row = 1;
        if (n <= 0) {
        	return 0;
        } else {
        	while (n - row >= 0) {
    			n = n - row;
    			count++;
    			row++;
        	}
        }
        return count;
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = 8;
		System.out.println(solution.arrangeCoins(n));
	}
}