# 498. Diagonal Traverse
# Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

# Time Complexity: O(m*n)
# Space Complexity: O(1) excluding output array
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:
# Elements in a diagonal share the same sum of row and column indices (i+j). 
# We keep track of our direction (up-right or down-left) using a boolean flag and flip it when we hit boundaries. 
# At each step, we either move up-right (row-1, col+1) or down-left (row+1, col-1), and when we hit matrix boundaries, we adjust our position and flip direction.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
            
        m, n = len(mat), len(mat[0])
        result = []
        row = col = 0
        going_up = True
        
        while len(result) < m * n:
            result.append(mat[row][col])
            
            if going_up:
                # Going up-right direction
                if col == n-1:  # Reached right boundary
                    row += 1
                    going_up = False
                elif row == 0:  # Reached top boundary
                    col += 1
                    going_up = False
                else:  # Continue going up-right
                    row -= 1
                    col += 1
            else:
                # Going down-left direction
                if row == m-1:  # Reached bottom boundary
                    col += 1
                    going_up = True
                elif col == 0:  # Reached left boundary
                    row += 1
                    going_up = True
                else:  # Continue going down-left
                    row += 1
                    col -= 1
        
        return result