"""
Problem: Product of Array Except Self
TC: O(n) SC: O(1)
Approach: First build the left product array and then multiply it with the right product array.
"""


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [0] * n
        answer[0] = 1

        for i in range(1, n):
            answer[i] = nums[i - 1] * answer[i - 1]

        R = 1

        for i in reversed(range(n)):
            answer[i] = answer[i] * R
            R = R * nums[i]

        return answer
