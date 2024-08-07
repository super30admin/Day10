# Time: O(n)
# space: O(n)
class Solution(object):
    def productExceptSelf(self, nums):
        lprod = [0]*len(nums)
        lprod[0] = 1
        rprod = [0]*len(nums)
        rprod[len(nums) - 1] = 1

        for i in range(1, len(nums)):
            lprod[i] = lprod[i - 1]* nums[i-1]
        for i in range(len(nums) - 2, -1, -1):
            rprod[i] = rprod[i + 1] * nums[i + 1]
        
        for i in range(len(nums)):
            lprod[i] = lprod[i] * rprod[i]
        return lprod