"""
TC: O(n) n: len(nums)
SP:O(n)  n: len(nums)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefixprod = [nums[0]]
        postfix = [nums[-1]]
        res = []
        for n in nums[1:]:
            prefixprod.append(prefixprod[-1]*n)
        for n in reversed(nums[:-1]):
            postfix.append(postfix[-1]*n)
        postfix = postfix[::-1]
        for i in range(len(nums)):
            l = prefixprod[i-1] if i> 0 else 1
            r = postfix[i+1] if i+1<len(nums) else 1
            res.append(l*r)     
        return res   
        