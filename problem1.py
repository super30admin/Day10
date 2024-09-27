'''
Time Complexity :O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation:
Create a dummy array to keep track of the product, for index i, the dummy[i] = prev nums[i] * rp (where rp=1 initally)
So for [1,2,3,4] on complete iteration from starting to end dummy = [1,1,2,6] now go from the end to the starting,
intialise rp = 1 again and multiply the nums[i] to dummy[i], starting from end to 0 the final array would be
[24,12,8,6]


'''


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        temp = 1
        rp = 1
        sum1 = [None for x in range(0, len(nums))]
        for i in range(0, len(nums)):
            rp = rp * temp
            sum1[i] = rp
            temp = nums[i]

        temp = 1
        i = len(nums) - 1
        rp = 1
        while i >= 0:
            rp = rp * temp
            sum1[i] = sum1[i] * rp
            temp = nums[i]
            i = i - 1

        return sum1