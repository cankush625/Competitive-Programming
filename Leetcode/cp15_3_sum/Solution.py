class Solution:
    # Leetcode Problem: https://leetcode.com/problems/3sum/description/
    #
    # Time complexity: O(n^2)
    # Space complexity: O(n)
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = set()
        start = 0
        # Sort the list
        nums = sorted(nums)
        while len(nums) >= 3:
            # Take the starting number and calculate the target sum
            # for the remaining list by subtracting this number from 0.
            # For remaining list, we now just have to find all the 
            # sets which sum to the target sum, basically Two Sum.
            start_num = nums[start]
            target = 0 - start_num
            # Create a new list of remaining numbers eacluding starting
            # number
            nums = nums[:start] + nums[start + 1:]
            mid = 0
            end = len(nums) - 1
            # Two sum to get all the set of numbers which sum to the
            # target
            while mid < end:
                two_sum = nums[mid] + nums[end]
                if two_sum == target:
                    # Add to set so that we have unique sets
                    result.add((start_num, nums[mid], nums[end]))
                    mid += 1
                    end -= 1
                if two_sum > target:
                    end -= 1
                if two_sum < target:
                    mid += 1
        return [list(res) for res in result]
