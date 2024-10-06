class Solution(object):
    # Approach:
    # 1. The problem is to traverse the matrix in a diagonal order.
    # 2. We alternate between moving diagonally upwards and downwards.
    # 3. For upward movement, the row decreases and the column increases.
    # 4. For downward movement, the row increases and the column decreases.
    # 5. We handle the boundaries of the matrix separately for upward and downward movements:
    #    - If we're moving upwards and hit the top row or the last column, we change direction to downward.
    #    - If we're moving downwards and hit the bottom row or the first column, we change direction to upward.
    # 6. Continue this process until we have traversed all elements in the matrix.

    # Time Complexity (TC):
    # - O(m * n), where m is the number of rows and n is the number of columns in the matrix.
    # - We are visiting each element of the matrix exactly once.

    # Space Complexity (SC):
    # - O(m * n) for the result array (res) which stores all the elements.
    # - O(1) for additional variables like cur_row, cur_col, and going_up (ignoring the input and output space).

    def findDiagonalOrder(self, mat):
        rows = len(mat)
        cols = len(mat[0])
        res = []

        cur_row, cur_col = 0, 0 
        going_up = True

        while len(res) != rows * cols:
            res.append(mat[cur_row][cur_col])

            if going_up:
                if cur_row == 0 or cur_col == cols - 1:  # Reached top row or rightmost column
                    going_up = False
                    if cur_col == cols - 1:
                        cur_row += 1  # Move down
                    else:
                        cur_col += 1  # Move right
                else:
                    cur_row -= 1
                    cur_col += 1
            else:
                if cur_row == rows - 1 or cur_col == 0:  # Reached bottom row or leftmost column
                    going_up = True
                    if cur_row == rows - 1:
                        cur_col += 1  # Move right
                    else:
                        cur_row += 1  # Move down
                else:
                    cur_row += 1
                    cur_col -= 1

        return res
