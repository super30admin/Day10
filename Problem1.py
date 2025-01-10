#Time Complexity  - O(n)
#Space Complexity - O(n) due to result array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * (len(nums))
        preProduct = 1
        for i in range(len(nums)):
            res[i] = preProduct
            preProduct *= nums[i]
        postProduct = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] *= postProduct
            postProduct *= nums[i]
        return res
        