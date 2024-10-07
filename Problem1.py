class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        out = [0] * len(nums)
        prefix = 1
        out[0] = 1
        for i in range(1,len(nums)):
            out[i] = prefix * nums[i-1]
            prefix = out[i]
            
        postfix = 1
        for i in range(len(nums)-1,-1,-1):
            out[i] = postfix * out[i]
            postfix = postfix * nums[i]
            
        return out
            
        