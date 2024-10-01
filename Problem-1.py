'''
    Time Complexity: O(2n)
    Space Complexity: O(1)
    Ran successfully on leetcode
    Approach: Maintain a running product for product of elements to the left. 
            Iterate again to calculate running product of elements to the right and multiple it to the left running product.
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [None for i in range(n)]

        rp = 1
        res[0] = rp

        for i in range(1, n):
            rp *= nums[i-1]
            res[i] = rp

        rp = 1
        for i in range(n-2, -1, -1):
            rp *= nums[i+1]
            res[i] *= rp

        return res