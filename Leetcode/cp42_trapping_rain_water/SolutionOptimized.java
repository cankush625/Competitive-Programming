class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int totalVolume = 0;
        int maxLeft = 0;
        int maxRight = 0;
        
        while (left <= right) {
            
            if (height[left] <= height[right]) {
            // If height(left) is greater than value of maxLeft then water will not be trapped. Update the maxLeft to height(left)
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalVolume += maxLeft - height[left];
                }
                left++;
            } else {
            // If height(right) is greater than value of maxRight then water will not be trapped. Update the maxRight to height(right)
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalVolume += maxRight - height[right];
                }
                right--;
            }
        }
        
        return totalVolume;
    }
}