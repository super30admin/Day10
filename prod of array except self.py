# TC: O(n)
# SC: O(n)
# This code compiled on LC successfully

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        leftProduct = [1] * length
        rightProduct = [1] * length
        prod = []

        for i in range(1, length):
            leftProduct[i] = leftProduct[i-1] * nums[i-1]
        
        for i in range(length-2, -1, -1):
            rightProduct[i] = rightProduct[i+1] * nums[i+1]
        for i in range(len(nums)):
            prod.append(leftProduct[i] * rightProduct[i])
        return prod
