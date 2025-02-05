# Problem 1 - Product of Array Except Self
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
We can separately multiply the numbers on the left and right sides of the current number, as division is not allowed. 
In the first loop, we calculate the product of all numbers to the left of the current number and store it in the result array. 
In the second loop, we calculate the product of all numbers to the right of the current number, multiply it with the left-side 
result, and store the final value in the result array.
'''
# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        result = [1 for i in range(length)] # Creating the result array and initializing to 1 since we need to do multiplication
        currentMultiplication = 1 # Storing the current multiplication value

        #Calculate the product of numbers which are at left side of the number
        for i in range(length):
            # store the currentMultiplication
            result[i] = currentMultiplication
            currentMultiplication *= nums[i]
        
        #Resetting the variable currentMultiplication for using to calculate right multiplication 
        currentMultiplication = 1

        #Calculate the product of numbers which are at right side of the number
        for i in range(length-1, -1, -1):
            result[i] *= currentMultiplication
            currentMultiplication *= nums[i]
        
        return result
