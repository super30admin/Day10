class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
    
        rows, cols = len(matrix), len(matrix[0])
        result = []
        
        # Define the boundaries
        top, bottom = 0, rows - 1
        left, right = 0, cols - 1
        
        # Define directions: right, down, left, up
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        direction_index = 0  # Start with moving right
        
        row, col = 0, 0
        for _ in range(rows * cols):
            result.append(matrix[row][col])
            
            # Calculate the next cell
            next_row = row + directions[direction_index][0]
            next_col = col + directions[direction_index][1]
            
            # Check if the next cell is within the boundaries
            if next_row < top or next_row > bottom or next_col < left or next_col > right:
                # Change direction
                if direction_index == 0:  # Moving right
                    top += 1
                elif direction_index == 1:  # Moving down
                    right -= 1
                elif direction_index == 2:  # Moving left
                    bottom -= 1
                elif direction_index == 3:  # Moving up
                    left += 1
                
                # Update direction index
                direction_index = (direction_index + 1) % 4
                
                # Update row and col to new direction
                row += directions[direction_index][0]
                col += directions[direction_index][1]
            else:
                # Continue in the current direction
                row = next_row
                col = next_col
        
        return result
            