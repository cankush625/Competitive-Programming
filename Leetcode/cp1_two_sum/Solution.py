class Solution:
    # Leetcode Problem: https://leetcode.com/problems/two-sum/description/
    # Time complexity: O(n)
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # Sort the nums list so that we can apply two pointer approach
        sorted_nums = sorted(nums)
        start_ptr = 0
        end_ptr = len(sorted_nums) - 1
        while start_ptr < end_ptr:
            sum = sorted_nums[start_ptr] + sorted_nums[end_ptr]
            # When the target sum is matched, note the numbers that count
            # to the target
            if sum == target:
                start_num, end_num = sorted_nums[start_ptr], sorted_nums[end_ptr]
                break
            if sum < target:
                start_ptr += 1
            if sum > target:
                end_ptr -= 1
        # Iterate over the original list of nums to find out the index of
        # the nums that sum to the target
        # Even if the sum is same number, like [2, 3, 3] and the target is 6
        # then the numbers will be 3 and 3 and since we iterate over the
        # original list of nums, the first occurance and second occurance
        # both will be taken into account.
        result = []
        for idx, num in enumerate(nums):
            if num in [start_num, end_num]:
                result.append(idx)
            if len(result) == 2:
                return result
        return result
