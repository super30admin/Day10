# The algorithm iterates through the matrix in a spiral order by adjusting boundaries (left, right, up, down) after each traversal
#  to avoid revisiting elements. It moves right, down, left, and up while ensuring rows and columns are not re-traversed.
# Time complexity: O(M⋅N). This is because we visit each element once.
# Space complexity: O(1). This is because we don't use other data structures. 
# Remember that we don't include the output array in the space complexity.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        rows, columns = len(matrix), len(matrix[0])
        up = left = 0
        right = columns - 1
        down = rows - 1
        while len(result) < rows * columns:
            for col in range(left, right + 1):
                result.append(matrix[up][col])

            for row in range(up + 1, down + 1):
                result.append(matrix[row][right])

            if up != down:
                for col in range(right - 1, left - 1, -1):
                    result.append(matrix[down][col])

            if left != right:
                for row in range(down - 1, up, -1):
                    result.append(matrix[row][left])

            left += 1
            right -= 1
            up += 1
            down -= 1
        return result
