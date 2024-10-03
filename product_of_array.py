"""
The brute force approach: for ith given index, find the product of numbers at all indexes except ith index.
This way the time complexity is O(n^2).
The optimal way is to use extra space and save the product of number before ith index and after ith index into
a two array and then traverse those 2 arrays and get the product of those 2 arrays.
How to do this? The idea is to calculate the running sum (product before/after) ith index and then update the
prod before/ after array.
This solution reduces time complexity to O(n). However, it requires two arrays to store the before and after sum.
To further optimize it, to O(1) we can store and calculate the running sum before/after in one array., making
space complexity O(1).
"""
from typing import List


class Solution:
    def productExceptSelf_noextraspace(self, nums: List[int]) -> List[int]:

        res = [1 for _ in range(len(nums))]

        running_prod = 1
        for i in range(1, len(nums)):
            running_prod = running_prod * nums[i - 1]
            res[i] = running_prod

        running_prod = 1
        for i in range(len(nums) - 2, -1, -1):
            running_prod = running_prod * nums[i + 1]
            res[i] = res[i] * running_prod

        return res

    def productExceptSelf_2array(self, nums: List[int]) -> List[int]:

        res = []
        prod_before = [1 for _ in range(len(nums))]
        prod_after = [1 for _ in range(len(nums))]

        running_prod = 1
        for i in range(1, len(nums)):
            running_prod = running_prod * nums[i - 1]
            prod_before[i] = running_prod

        running_prod = 1
        for i in range(len(nums) - 2, -1, -1):
            running_prod = running_prod * nums[i + 1]
            prod_after[i] = running_prod

        print(prod_before, prod_after)
        for i, j in zip(prod_before, prod_after):
            prod = i * j
            res.append(prod)
        return res
