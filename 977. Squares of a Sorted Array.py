"""
https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
"""

class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        left = 0
        right = n - 1
        for i in range(len(nums) - 1, -1, -1):
            if abs(nums[left]) > abs(nums[right]):
                square = nums[left]
                left += 1
                "print in s2"
            else:
                print("in s1")
                square = nums[right]
                right -= 1
            result[i] = square * square
        return result

