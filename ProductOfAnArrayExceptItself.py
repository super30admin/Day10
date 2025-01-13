# Time Complexity : O(n), where n is the number of elements in nums
# Space Complexity : O(1), because we are using only the array we are supposed to return
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# we are using 1 array to store the product except self
# first we compute the product of all left elements using running sum
# then we multiply those left product values with all right elements


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if nums is None:
            return -1
        
        n = len(nums)

        # new array to store the product except self
        dp = [1] * n
        # intializing the running product to 1
        rp = 1
        dp[0] = 1
        # left array - every index has a product of all left elements
        # including the nums[i - 1] for every running product
        for i in range(1, n):
            rp = rp * nums[i-1]
            dp[i] = rp
        
        rp = 1
        # now including the right elements as well
        # the loop will fail when i becomes -1
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            dp[i] = dp[i] * rp

        return dp

        



            
        