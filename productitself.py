"""
Time Complexity: O(n)
Space Complexity: O(1)
"""

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        rp = 1
        #prefix product
        result = [None] * len(nums)
        result[0] = rp

        for i in range(1, len(nums), 1):
            rp = nums[i-1] * rp
            result[i] = rp 
        #postfix product
        rp = 1

        for i in range(len(nums)-2, -1, -1):
            rp = nums[i+1] * rp
            result[i] = result[i] * rp

        return result
    