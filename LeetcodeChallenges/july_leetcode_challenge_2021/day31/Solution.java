class Solution {
    // Time complexity O(n)
    // Space complexity O(2n)
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int[] maxToTheLeft = calcPrefixMax(height);
        int[] maxToTheRight = calcSuffixMax(height);
        int totalVolume = 0;
        
        // For every element, get the minimum bar from max to the left and max to the right, and
        // calculate how much water it can trap
        for (int i = 0; i < height.length; i++) {
            totalVolume += (Math.min(maxToTheLeft[i], maxToTheRight[i]) - height[i]);
        }
        
        return totalVolume;
    }
    
    // Finding the max to the left of every element
    private int[] calcPrefixMax(int[] height) {
        int temp = height[0];
        int[] res = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > temp) {
                temp = height[i];
                res[i] = temp;
            } else {
                res[i] = temp;
            }
        }
        return res;
    }
    
    // Finding max to the right of every element
    private int[] calcSuffixMax(int[] height) {
        int temp = height[height.length-1];
        int[] res = new int[height.length];
        for (int i = height.length-1; i >= 0; i--) {
            if (height[i] > temp) {
                temp = height[i];
                res[i] = temp;
            } else {
                res[i] = temp;
            }
        }
        return res;
    }
}