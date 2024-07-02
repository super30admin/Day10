#Time Complexity: O(n)
#Space Complexity : O(n)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1]*len(nums)
        np = 1

        for i in range(len(nums) - 1):
            output[i + 1] = output[i] * nums[i]

        for i in range(len(nums) - 2, -1, -1):
            np *= nums[i+1]
            output[i] = output[i] * np
            
        
        return output
