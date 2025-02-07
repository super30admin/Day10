'''
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : same implementation as in class

// Your code here along with comments explaining your approach
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result  = [0] * len(nums)
        leftProduct = 1
        
        for i in range(len(nums)):
            result[i] = leftProduct
            leftProduct *= nums[i]
        
        rightProduct = 1
        for j in reversed(range(len(nums))):
            result[j] *= rightProduct
            rightProduct *= nums[j]

        return result

