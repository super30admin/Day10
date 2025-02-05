"""
Array approach -
TC - O(2n) since two passes. Final TC - O(n)
SC - O(1)
"""


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums is None or len(nums) == 0: return []

        n = len(nums)

        rProd = 1
        # leftPtr = 1

        rtnData = [None] * n

        # since nothing on the left of 0th index of nums
        rtnData[0] = 1

        # get left products
        for i in range(1, n):
            rProd = rProd * nums[i - 1]
            rtnData[i] = rProd
        # print(rtnData)

        # reset rProd to 1
        rProd = 1

        # start from right to left
        # n-2 since there's nothing on the right on last element of rtnData so last element stays as it is
        for i in range(n - 2, -1, -1):
            rProd = rProd * nums[i + 1]
            rtnData[i] = rProd * rtnData[i]
        # print(rtnData)

        return rtnData
