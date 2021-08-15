def swap(nums, i, j):
    nums[i], nums[j] = nums[j], nums[i]

class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        i=1
        while i < n-1:
            sum = nums[i-1]+nums[i+1]
            if sum%2 == 0 and nums[i] == sum // 2:
                swap(nums, i, i+1)
                if i > 1:
                    i-=1
            else:
                i+=1
        return nums