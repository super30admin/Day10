
# 238. Product of Array Except Self

# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:
# Use two arrays to store the prefix and suffix products. (Later optimized to use a single array)
# The prefix product is the product of all the elements before the current element.
# The suffix product is the product of all the elements after the current element.
# The result is the product of the prefix and suffix products.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        if n == 0:
            return nums

        result = [0]*n
        result[0] = prefix = 1
        for i in range(1,n):
            prefix *= nums[i-1]
            result[i] = (prefix)

        suffix = 1
        for i in range(n-2,-1, -1):
            suffix *= nums[i+1]
            result[i] *= suffix 

        return result