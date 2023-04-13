class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        # Check for empty matrix
        if not matrix or not matrix[0]:
            return []

        # Get number of rows and columns
        m, n = len(matrix), len(matrix[0])

        # Create result array to store diagonal elements
        result = []

        # Initialize variables for current row, column, and direction
        row, col, direction = 0, 0, 1

        # Iterate over all elements in the matrix
        for i in range(m * n):
            # Add current element to result array
            result.append(matrix[row][col])

            # Move to next diagonal element
            row -= direction
            col += direction

            # If we go out of bounds, change direction and adjust row/column
            if row >= m:
                row = m - 1
                col += 2
                direction = -direction
            if col >= n:
                col = n - 1
                row += 2
                direction = -direction
            if row < 0:
                row = 0
                direction = -direction
            if col < 0:
                col = 0
                direction = -direction

        # Return the result array
        return result
