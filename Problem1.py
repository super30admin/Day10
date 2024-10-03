class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        result = [1] * n
        rp = 1

        result[0] = rp
        for i in range(1, n):
            rp = nums[i - 1] * rp
            result[i] = rp

        rp = 1
        for i in range(n - 2, -1, -1):
            rp = nums[i + 1] * rp
            result[i] = result[i] * rp

        return result

