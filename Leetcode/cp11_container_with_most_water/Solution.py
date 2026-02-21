class Solution:
    # Leetcode Problem: https://leetcode.com/problems/container-with-most-water/description/
    #
    # Time complexity: O(n)
    # Space complexity: O(1)
    def maxArea(self, height: list[int]) -> int:
        start = 0
        end = len(height) - 1
        max_area = 0
        while start < end:
            # Area that will hold the water will be:
            # height of min bar * space in between
            area = min(height[start], height[end]) * (end - start)
            max_area = max(max_area, area)
            # Move the pointer from the bar with min height
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        return max_area
