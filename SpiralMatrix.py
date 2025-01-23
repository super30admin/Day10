# Time Complexity: O(m * n), where m is the number of rows and n is the number of columns in the matrix, as we visit each element once.
# Space Complexity: O(1), excluding the output list `result`, as no additional space proportional to the input size is used.
# Approach: Used four boundaries (top, bottom, left, right) to traverse the matrix in a spiral order, updating the boundaries after each traversal.

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
            # Top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top = top + 1

            # Right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right = right - 1

            # Bottom row
            if top <= bottom:  # Necessary check for this step
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1

            # Left column
            if left <= right:  # Necessary check for this step
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left = left + 1

        return result
