class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        leftnums = []
        prod = 1
        for i in range(len(nums)):
            leftnums.append(prod)
            prod = prod * nums[i]
        prod = 1
        rightnums = nums.copy()
        for i in range(len(nums)-1, -1, -1):
            rightnums[i] = leftnums[i] * prod
            prod = prod * nums[i]
        return rightnums


        