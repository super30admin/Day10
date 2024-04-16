# Array-1

## Problem 1
# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Approach
# create an array 'leftproduct' and initialize it to size len(nums). Initialize variable 'running product' to 1.
# traverse through 1 to len(nums) and calculate the rp using rp * previous value in nums. Append it to res array
# Set rp to 1 again. Traverse nums in reverse from second last index and multiply rp with element on right of current index. Append product of element in res array with rp and return res 
        
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        rp = 1
        leftproduct = [1]
        res = [rp for i in range(len(nums))]

        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            res[i] = rp
        
        rp = 1

        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i+1]
            res[i] = res[i] * rp
        
        return res
