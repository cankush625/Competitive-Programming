class Solution:
    # Leetcode Problem: https://leetcode.com/problems/contains-duplicate/description/
    def containsDuplicate(self, nums: list[int]) -> bool:
        return len(nums) != len(set(nums))
