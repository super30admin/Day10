class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix)  # Number of rows
        n = len(matrix[0])  # Number of columns
        top = 0  # Top boundary
        bottom = m - 1  # Bottom boundary
        left = 0  # Left boundary
        right = n - 1  # Right boundary
        res = []  # Result array

        while top <= bottom and left <= right:  # Continue while there are layers left
            # Traverse from left to right across the top row
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1  # Move the top boundary down

            # Traverse from top to bottom down the right column
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1  # Move the right boundary left

            # Check if there's still a bottom row to process
            if top <= bottom:
                # Traverse from right to left across the bottom row
                for i in range(right, left - 1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1  # Move the bottom boundary up

            # Check if there's still a left column to process
            if left <= right:
                # Traverse from bottom to top up the left column
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1  # Move the left boundary right

        return res


# time complexity is O(m*n) where m is the number of rows and n is the number of columns
# space complexity is O(m*n) where m is the number of rows and n is the number of columns of res
