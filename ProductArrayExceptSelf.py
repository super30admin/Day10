#  Time Complexity : O(N) 
# Space Complexity : O(1) since we are using the same list to return the output as the one for computation. 

  class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return 0
        
        rp_left = 1
        rp_right = 1
        right_list = [1] * len(nums)
        
        l = len(nums) - 1
        for j in range(len(nums) - 1):
            rp_right = rp_right * nums[l - j]
            right_list[l - (j + 1)] = rp_right
        
        for i in range(len(nums)):
            if i == 0:
                rp_left = 1
            else:
                rp_left = rp_left * nums[i - 1]
            right_list[i] = right_list[i] * rp_left
        
        return right_list
