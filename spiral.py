# The code defines a spiralOrder method to traverse a 2D matrix in a spiral order and return the elements in the order they are visited.

# Initialization:
#   - 'res' is an empty list to store the elements in spiral order.
#   - 'directions' holds four possible movement directions: right (0,1), down (1,0), left (0,-1), and up (-1,0).
#   - 'steps' is initialized with the number of steps for horizontal and vertical movements.
#       - steps[0] represents the remaining steps for moving right/left (number of columns),
#       - steps[1] represents the remaining steps for moving down/up (number of rows minus 1).
#   - 'r' and 'c' are the starting row and column indices, initialized to start outside the first element to enable the first move.
#   - 'd' is the direction index, starting at 0 for the initial rightward direction.

# Main Loop:
#   - The loop continues as long as there are steps left in the current direction.
#   - For each direction:
#       - Move for the current number of steps in the current direction:
#           - Update the row and column indices (r and c) according to the current direction.
#           - Append the current element matrix[r][c] to 'res'.
#       - After completing the steps in the current direction, decrease the step count for the current direction (steps[d & 1]).
#       - Change direction by incrementing 'd' and taking modulo 4 to cycle back to the beginning after four directions (right, down, left, up).

# Final Result:
#   - Once all elements have been visited, return the 'res' list containing the elements in spiral order.

# TC: O(m * n) - Each element in the matrix is visited exactly once.
# SC: O(1) - Excluding the output list, only a few variables are used for control, so the space complexity is constant.


from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        steps = [len(matrix[0]), len(matrix) - 1]

        r, c, d = 0, -1, 0
        while steps[d & 1]:
            for i in range(steps[d & 1]):
                r += directions[d][0]
                c += directions[d][1]
                res.append(matrix[r][c])
            steps[d & 1] -= 1
            d += 1
            d %= 4
        return res