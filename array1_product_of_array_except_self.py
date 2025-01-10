# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
# Firstly the product of items to the left of an element is computed then the right.
# A variable rp is initialised to hold the running product and then result is stored in the variable, result of type list 
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1
        result = []
        #computing product of elements to the left
        for i in range(len(nums)):
            result.append(rp)
            rp = rp*nums[i]

        rp= 1
        #computing product of elements to the right
        for i in range (len(nums)-1, -1, -1):
            result[i] *= rp
            rp *= nums[i]

        return result