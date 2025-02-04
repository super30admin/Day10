# 54. Spiral Matrix

# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:
# Keep track of the top, bottom, left, and right boundaries of the matrix.
# Traverse the matrix in a spiral manner by incrementing the top boundary, decrementing the bottom boundary, incrementing the left boundary, and decrementing the right boundary.
# Check for out of bounds conditions and update the boundaries accordingly after each traversal.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        top, bottom, left, right = 0, len(matrix) - 1, 0, len(matrix[0]) - 1
        while top <= bottom and left <= right:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result

