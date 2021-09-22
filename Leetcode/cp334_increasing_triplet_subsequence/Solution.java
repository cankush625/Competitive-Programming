class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            // update small if n is smaller than both
            // update big only if n is greater than small but smaller than big
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            } else {
                // return true if you find a number bigger than both small and big
                return true;
            }
        }
        return false;
    }
}