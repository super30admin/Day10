"""
 FAANMG Problem #26 {Medium}

238. Product of Array Except Self

Time Complexity : O(N)



Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
    

We are using a running product 

in the first iteration, we are storing the multiplied previous number to the prefix in the output index

Similarly doing the same from reverse




                  

@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        n = len(nums)
        result = [1]*n
        
        prefix = 1
        
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]
            
        postfix =1
        
        for i in range(n-1, -1, -1):
            result[i] *= postfix
            
            postfix *= nums[i]
            
        return result