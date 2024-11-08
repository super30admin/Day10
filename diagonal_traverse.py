# The code defines a findDiagonalOrder method to return all elements of a 2D matrix in diagonal order.
# Diagonal order involves traversing diagonals in an up-right and down-left zigzag pattern across the matrix.

# Step 1:
#   - Initialize an empty list 'result' to store the elements in diagonal order.

# Step 2:
#   - Retrieve the dimensions of the matrix (m for rows, n for columns).
#   - Set initial indices i and j to 0 (starting at the top-left corner of the matrix).
#   - Initialize 'direction' to 0, where 0 represents the up-right direction and 1 represents the down-left direction.

# Step 3:
#   - Iterate m * n times, once for each element in the matrix:
#       - Append the current element mat[i][j] to 'result'.
#       - Determine movement based on the current 'direction':
#           - If direction is 0 (up-right):
#               - If we're at the last column (j == n - 1), move down by incrementing i and change direction to 1 (down-left).
#               - If we're at the first row (i == 0), move right by incrementing j and change direction to 1.
#               - Otherwise, move up-right by decrementing i and incrementing j.
#           - If direction is 1 (down-left):
#               - If we're at the last row (i == m - 1), move right by incrementing j and change direction to 0 (up-right).
#               - If we're at the first column (j == 0), move down by incrementing i and change direction to 0.
#               - Otherwise, move down-left by incrementing i and decrementing j.

# Step 4:
#   - After traversing all elements, return the 'result' list containing the matrix elements in diagonal order.

# TC: O(m * n) - The time complexity is linear in the number of elements, as each element is accessed once.
# SC: O(1) - The space complexity is constant, excluding the output list, as only a few variables are used for control flow.


class Solution:
  def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
    # Step 1
    result = []
    # Step 2
    m, n = len(mat), len(mat[0])
    i = j = direction = 0
    
    # Step 3
    for _ in range(m * n):
        result.append(mat[i][j])
        
        if direction == 0: # Up-right direction
            if j == n - 1:
                direction = 1 # Change direction to down-left
                i += 1
            elif i == 0:
                direction = 1 # Change direction to down-left
                j += 1
            else:
                i -= 1
                j += 1
        else: # Down-left direction
            if i == m - 1:
                direction = 0 # Change direction to up-right
                j += 1
            elif j == 0:
                direction = 0 # Change direction to up-right
                i += 1
            else:
                i += 1
                j -= 1
    
    # Step 4
    return result