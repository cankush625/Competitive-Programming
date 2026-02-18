class Solution:
    # Leetcode Problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    #
    # Time complexity: O(n)
    # Space complexity: O(1)
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        start = 0
        end = len(numbers) - 1
        while start <= end:
            addition = numbers[start] + numbers[end]
            if addition == target:
                return [start + 1, end + 1]
            if addition < target:
                start += 1
            else:
                end -= 1
        return []
