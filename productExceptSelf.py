class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        rp = 1
        res[0] = 1

        for i in range(1, len(nums)):
            rp = rp * nums[i - 1]
            res[i] = rp

        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            rp = rp * nums[i + 1]
            res[i] = res[i] * rp

        return res

