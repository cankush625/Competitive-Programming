class Solution:
    # Leetcode Problem: https://leetcode.com/problems/longest-consecutive-sequence/description/
    #
    # Time complexity: O(n)
    # Space complexity: O(n)
    def longestConsecutive(self, nums: list[int]) -> int:
        longest_streak = 0
        nums = set(nums)
        for num in nums:
            # Adding a check that if current num - 1 is not present in
            # the nums then do the streak computation. This will save
            # us from doing overlapping calculations for the greater
            # number whose immediate previous number will be processed
            # to get the result.
            # This way, we are avoiding the computationf or the larger
            # number present in the streak.
            if num - 1 not in nums:
                # Look if the next number is present for the current number
                # untill the next number is not present.
                current_streak = 0
                current_num = num
                while current_num in nums:
                    current_num = current_num + 1
                    current_streak += 1
                longest_streak = max(longest_streak, current_streak)
        return longest_streak
