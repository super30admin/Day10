# time: O(n)
# space: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        curr = 1
        res = [1]*len(nums)

        for i in range(len(nums)):
            res[i] = curr
            curr = curr*nums[i]

        curr = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] = res[i] * curr
            curr = curr*nums[i]      

        return res        