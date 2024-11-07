# Explain your approach in three sentences only at top of your code
# Approach: Use four boundary pointers (top, bottom, left, right) to keep track of the spiral traversal limits.
# Traverse the matrix in a spiral order by moving right, down, left, and up within the boundary limits, adjusting the pointers as each side is fully traversed.
# Continue the traversal until all elements are visited, ensuring each direction change is within the current boundaries.

# Time Complexity: O(m * n), where m is the number of rows and n is the number of columns, as each element is visited once.
# Space Complexity: O(1), ignoring the output list which stores the result.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        result = []
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1
        
        while top <= bottom and left <= right:
            # Traverse from left to right along the top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1  # Move the top boundary down
            
            # Traverse from top to bottom along the right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1  # Move the right boundary left
            
            if top <= bottom:
                # Traverse from right to left along the bottom row
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1  # Move the bottom boundary up
            
            if left <= right:
                # Traverse from bottom to top along the left column
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1  # Move the left boundary right
        
        return result
