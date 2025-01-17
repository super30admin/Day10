class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1
        result = [rp]
        for i in range(1, len(nums)):
            rp = rp * nums[i-1]
            result.append(rp)
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
        return result
# Time - O(n) + O(n) = O(n)
# Space - O(1) we are not using any extra space, result is not included space complexity.


        