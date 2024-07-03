"""
## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
"""

#TC: O(N)
#SC: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == []:
            return 0
        
        n = len(nums)
        
        result = [1 for _ in range(n)]
        
        rp = 1
        result[0] = rp
        
        # Left to right
        for i in range(1, n):
            rp *= nums[i - 1]
            result[i] = rp
            
        rp = 1
        # Right to left
        for i in range(n-2, -1, -1):
            rp *= nums[i + 1]
            result[i] = rp * result[i ]
            
        return result
                                                
        