"""

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# The approach uses two passes to compute the product of all elements except self without using division.  
# The first pass calculates the prefix product for each element, and the second pass multiplies it by the suffix product in reverse order.  
# This results in an efficient O(n) solution with O(1) extra space (excluding the output array).  

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        length = len(nums)
        res = [0] * length

        res[0] = 1
        for i in range(1, length):
            res[i] = res[i-1]*nums[i-1]

        r = 1
        for i in reversed(range(length)):
            res[i] = res[i] * r
            r *= nums[i]

        return res
