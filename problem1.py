# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1]

        # left pass
        rp = 1
        for i in range(1, n):
            rp = nums[i-1]*rp
            result.append(rp)
        
        # right pass
        rp = 1
        for i in range(n-2, -1, -1):
            rp = nums[i+1]*rp
            result[i] = result[i]*rp

        return result