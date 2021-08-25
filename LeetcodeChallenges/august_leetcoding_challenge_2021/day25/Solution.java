class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int current = left * left + right * right;
            if (current < c) {
                left++;
            } else if (current > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}