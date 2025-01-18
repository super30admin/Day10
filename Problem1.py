# Iterating first and storing the right side product in a new array and then multiplying the left side product in place in the new array
# TC: O(n)
# SC: O(1)
# Yes, this worked in leetcode


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return 0
        n = len(nums)
        res = [0] * n
        rp = 1
        res[0] = 1
        for i in range(1, n):
            rp = rp * nums[i - 1]
            res[i] = rp
        rp = 1
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            res[i] = res[i] * rp
        
        return res
