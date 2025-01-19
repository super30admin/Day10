# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Traverse from left to right multiplying, then traverse right to left

# Note to self: Remember to take a rp variable too, that's where I got stuck during right product
from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1 for i in range(n)]

        rp = 1
        for i in range(1, n): # left product
            rp = rp * nums[i-1]
            result[i] = rp

        rp = 1
        for i in range(len(nums) - 2, -1, -1): # right product
            rp = rp * nums[i+1]
            result[i] = result[i] * rp

        return result