"""
Array-1

Problem1 (https://leetcode.com/problems/product-of-array-except-self/)

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is first find the left product array and then iterate from right and mutlipy the product with the left product array.
"""

# Approach 1
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 0:
            return []

        running_product = 1        
        left_product_arr = [1] * len(nums)
        for i in range(1, len(nums)):
            running_product *= nums[i-1]
            left_product_arr[i] = running_product

        right_product_arr = [1] * len(nums)
        running_product = 1
        for i in range(len(nums)-2, -1, -1):
            running_product *= nums[i+1]
            right_product_arr[i] = running_product

        for i in range(len(nums)):
            right_product_arr[i] *= left_product_arr[i] 

        return right_product_arr   
        
# Approach 2 (Saving extra space)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 0:
            return []

        running_product = 1        
        left_product_arr = [1] * len(nums)
        for i in range(1, len(nums)):
            running_product *= nums[i-1]
            left_product_arr[i] = running_product

        running_product = 1
        for i in range(len(nums)-2, -1, -1):
            running_product *= nums[i+1]
            left_product_arr[i] *= running_product # final product in the left_product_arr

        return left_product_arr   
        