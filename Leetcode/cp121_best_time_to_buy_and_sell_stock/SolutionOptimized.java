class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int c: prices) {
            min = Math.min(c, min);
            maxProfit = Math.max(maxProfit, c - min);
        }
        return maxProfit;
    }
}