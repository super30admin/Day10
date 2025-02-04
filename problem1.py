
# Time Complexity : O(n)
# Space Complexity : Auxiliary O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []

        cur_p = 1
        for num in nums:
            cur_p *= num
            res.append(cur_p)

        r_p = 1
        for ix in range(len(nums)-1,-1,-1):
            if ix != 0:
                res[ix] = res[ix-1] * r_p
            else:
                res[ix] = r_p
            r_p *= nums[ix]

        return res