#Time Complexity : O(n)
#Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        p = 1
        prodN = []
        # 1, 1, 2, 6
        for i in range(len(nums)):
            prodN.append(p)
            p *= nums[i]
        
        p = 1
        
        # 1, 1, 2, 6
        #
        for i in range(len(nums)-1, -1, -1):
            prodN[i] = p*prodN[i]
            p *= nums[i]
        return prodN