#  problem: https://leetcode.com/problems/product-of-array-except-self/description/ 
# Time complexity: O(n)
# Space complexity: O(1)

#  Did this code successfully run on Leetcode : Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1 
        res = []
        for i in range(len(nums)):
            res.append(rp)
            rp = rp * nums[i]
        
        rp = 1 
        for j in range(len(nums)-1, -1, -1):
            res[j] *= rp
            rp = rp * nums[j]

        return res