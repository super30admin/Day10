class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n
        prefix_prod = 1
        suffix_prod = 1

        for i in range(n):
            res[i] = res[i] * prefix_prod
            prefix_prod = prefix_prod * nums[i]

        for i in range(n - 1, -1, -1):
            res[i] = res[i] * suffix_prod
            suffix_prod = suffix_prod * nums[i]
        return res


