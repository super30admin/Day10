class Solution:
    # Time Complexity O(M*N)
    # Space Complexity O(1) not counting the output list result else O(M*N)
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # Get the dimensions of the matrix
        m = len(mat)
        n = len(mat[0])
        
        # Initialize the starting position
        row = 0
        col = 0
        
        # Create a result array to store the final diagonal order
        result = [0 for x in range(m * n)]
        
        # Index to keep track of position in the result array
        index = 0
        
        # Direction flag, 1 for up-right, -1 for down-left
        Dir = 1
        
        # Traverse the matrix until all elements are added to the result array
        while index < m * n:
            # Assign the current matrix element to the result array
            result[index] = mat[row][col]
            index += 1
            
            # If the current direction is up-right
            if Dir == 1:
                # Check if we have reached the last column, change direction to down-left
                if col == n - 1:
                    Dir = -1
                    row += 1
                # Check if we have reached the first row, change direction to down-left
                elif row == 0:
                    Dir = -1
                    col += 1
                # Otherwise, move up-right
                else:
                    row -= 1
                    col += 1
            # If the current direction is down-left
            elif Dir == -1:
                # Check if we have reached the last row, change direction to up-right
                if row == m - 1:
                    Dir = 1
                    col += 1
                # Check if we have reached the first column, change direction to up-right
                elif col == 0:
                    Dir = 1
                    row += 1
                # Otherwise, move down-left
                else:
                    row += 1
                    col -= 1
        
        # Return the result array
        return result
