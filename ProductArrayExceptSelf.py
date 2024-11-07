# Explain your approach in three sentences only at top of your code
# Approach: Use two passes to build the result array by storing the product of all elements to the left of each index in one pass, 
# and then multiplying it with the product of all elements to the right of each index in a second pass.
# This avoids the use of division and achieves the desired O(n) time complexity with constant extra space by reusing the output array.

# Time Complexity: O(n), where n is the length of the array, as we traverse the array twice.
# Space Complexity: O(1), ignoring the output array as per the problem statement's requirements.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [1] * n  # Initialize the output array with 1s
        
        # First pass: Calculate the left product for each element
        left_product = 1
        for i in range(n):
            output[i] = left_product
            left_product *= nums[i]  # Update left_product for the next element
        
        # Second pass: Calculate the right product for each element and multiply it with the left product
        right_product = 1
        for i in range(n - 1, -1, -1):
            output[i] *= right_product
            right_product *= nums[i]  # Update right_product for the next element
        
        return output
