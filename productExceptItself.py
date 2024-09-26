#TimeComplexity:O(N) 
#SpaceComplexity: constant space as we are not using any extra space.
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        product=[1]*len(nums)
        for i in range(1,len(nums)):
            product[i]=product[i-1]*nums[i-1]
        RightProduct=1
        for i in range(1,len(nums)):
            RightProduct*=nums[len(nums)-i]
            product[len(nums)-i-1]*=RightProduct
        return product
