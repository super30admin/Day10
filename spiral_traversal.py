"""
Need 4 pointers: for top, bottom, left, right boundary.
        left                right
top     1,           2,      3
        4,          5,       6
bottom  7,          8,      9

first print left to right and decrement top, then go from top to bottom and decrement right, then right to left
decrease bottom, then go from bottom to top.
Meaning there will be 4 for loops, one for each direction and after for loop updating the counter.
When to stop? When left> right and bottom < top.
Since after the for loop the base condition variables are changes, we need to keep track of out of bounds.
Also, some of the out of bounds are already checked for loop. Also, for the 3rd for loop,two counters of the base
condition are changed.

To do: recursive approach
"""
from typing import List


class Solution:
    class Solution:
        def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
            rows = len(matrix)
            cols = len(matrix[0])
            ans = []
            top, bottom, left, right = 0, rows - 1, 0, cols - 1

            while (left <= right and top <= bottom):

                if left <= right and top <= bottom:
                    for i in range(left, right + 1):
                        ans.append(matrix[top][i])
                    top += 1

                if left <= right and top <= bottom:
                    for i in range(top, bottom + 1):
                        ans.append(matrix[i][right])
                    right -= 1

                if left <= right and top <= bottom:
                    for i in range(right, left - 1, -1):
                        ans.append(matrix[bottom][i])
                    bottom -= 1

                if left <= right and top <= bottom:
                    for i in range(bottom, top - 1, -1):
                        ans.append(matrix[i][left])
                    left += 1

            return ans








