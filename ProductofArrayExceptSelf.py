"""
    Approach: The problem is solved without using division by using two passes through the input list.
        -> In the first pass, calculate the running product of all elements to the left of the current 
        index and store it in the result list.
        -> In the second pass, calculate the running product of all elements to the right of the current 
        index by traversing from the end of the list to the beginning, multiplying it with the existing 
        value in the result list.

    Time complexity: O(n)
    
    Space complexity: O(n)
    
    Accepted on LeetCode? Yes!
    LeetCode Link: https://leetcode.com/problems/product-of-array-except-self/description/
"""

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res, rSum, n = [1], 1, len(nums)

        # Since the problem states to calculate the product except self
        # we would have 2 passes of the input array.

        # Pass 1, would calculate the running sum from index 1 to n-1
        # Pass 2, would calculate the running sum from index n-2 to 0

        # During the pass, the output array would be constructed based on the running
        # sum value times the current index of the input array.

        # Main logic: Skip first and last element in running sum.
        for i in range(1, n):
            rSum *= nums[i - 1]
            res.append(rSum)

        rSum = 1

        for i in range(n - 2, -1, -1):
            rSum *= nums[i + 1]
            res[i] *= rSum

        return res


if __name__ == "__main__":
    sol = Solution()
    test_case = [1, 2, 3, 4]
    result = sol.productExceptSelf(test_case)

    print(f"{result=}")
    assert result == [24, 12, 8, 6]
