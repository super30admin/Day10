# Time O(n)
# Space O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1]*n
        rp = 1
        for i in range(1, n):
            rp *= nums[i-1]
            result[i] = rp
        rp = 1
        for j in range(n-2, -1, -1):
            rp *= nums[j+1] 
            result[j] *= rp
        return result
        