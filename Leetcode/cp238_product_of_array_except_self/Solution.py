import math

class Solution:
    # Leetcode Problem: https://leetcode.com/problems/product-of-array-except-self/
    #
    # Time complexity: O(n^2)
    # The first n is for the for loop and second n is form the math.prod function
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        result = []
        for idx in range(len(nums)):
            arr = nums[:idx] + nums[idx+1:]
            sum = math.prod(arr)
            result.append(sum)
        return result
