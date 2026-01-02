class Solution:
    # Leetcode Problem: https://leetcode.com/problems/top-k-frequent-elements/description/
    #
    # Time complexity: O(n)
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        frequency_map = {}
        for num in nums:
            frequency_map[num] = frequency_map.get(num, 0) + 1
        # Sort the map of frequency by the values in reverse, value is the
        # frequency here and get the list of list of keys which are numbers
        ordered_nums_by_frequency = [
            k for k, v in sorted(
                frequency_map.items(), key=lambda k: k[1], reverse=True
            )
        ]
        idx = 0
        result = []
        while idx != k:
            result.append(ordered_nums_by_frequency[idx])
            idx += 1
        return result
