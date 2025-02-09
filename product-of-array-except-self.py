# Time : O(n)
# Space: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prod = [1] * n
        for i in range(1, n):
            prod[i] = prod[i-1] * nums[i-1]
        currProd = 1
        for i in range(n-2, -1, -1):
            currProd = nums[i+1] * currProd
            prod[i] = currProd * prod[i]
        return prod


        