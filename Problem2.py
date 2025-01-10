#Time Complexity = O(m*n)
#Space Complexity = O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        m, n = len(mat), len(mat[0])
        result = []  # Initialize the result list
        dir = 1  # 1 for upward, -1 for downward
        row, col = 0, 0  # Starting point
        
        while len(result) < m * n:
            result.append(mat[row][col])  # Add the current element
            
            # Move diagonally
            if dir == 1:
                if col == n - 1:  # Reached the right boundary
                    dir = -1
                    row += 1
                elif row == 0:  # Reached the top boundary
                    dir = -1
                    col += 1
                else:  # Move upward
                    row -= 1
                    col += 1
            else:  # dir == -1
                if row == m - 1:  # Reached the bottom boundary
                    dir = 1
                    col += 1
                elif col == 0:  # Reached the left boundary
                    dir = 1
                    row += 1
                else:  # Move downward
                    row += 1
                    col -= 1
        
        return result
