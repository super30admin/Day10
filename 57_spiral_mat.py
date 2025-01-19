# Time complexity - O(m * n)
# Space complexity - O(1)

# Approach - Individually lay out the conditions that need to be followed for traversing, 
# using four directions up, down, left, right

from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = []

        top = 0
        bottom = m - 1
        left = 0
        right = n - 1

        while top <= bottom and left <= right:
            # top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # right col
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # bottom row
            if top <= bottom and left <= right:
                for i in range(right, left -1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            # left col
            if top <= bottom and left <= right:
                for i in range(bottom, top -1, -1):
                    result.append(matrix[i][left])
                left += 1
        
        return result