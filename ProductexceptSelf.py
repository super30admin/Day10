# Time Complexity O(n)
# Space Complexoty O(n)

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        new = [1]* len(nums)

        rsum = 1
        for i in range(1, len(nums)):
            new[i] = rsum * nums[i-1]
            rsum *= nums[i - 1]
        rsum = 1
        for i in range(len(nums) -2 , -1, -1):
            rsum *= nums[i + 1]
            new[i] = rsum * new[i]

        
        return new
nums = [1,2,3,4]
solution = Solution()

print(solution.productExceptSelf(nums))
            
        
