# Calculate Prefix Product from L to R and store it in the result
# Update result w/ Postfix Product from R to L
# Return res
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums) # Result array with all values as 1s as default of size nums

        # Iterate over nums from L to R
        pre = 1
        for i in range(len(nums)):
            res[i] = pre
            pre *= nums[i]
        # Iterate over nums from R to L
        post = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= post
            post *= nums[i]
        return res
        # T: O(n), S: O(1)