'''
Time Complexity :O(min(m,n) * n )
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation:
Iteration 1 - Iterates through top row and the right column, iteration -2 - iterates through bottom row and left column
all that is left is center and adds that to the list.
'''


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0:
            return []

        row = col = 0
        m = len(matrix)
        n = len(matrix[0])
        direction = 1
        # up = 1, down = -1
        result = [None for y in range(0, m * n)]
        i = 0
        while i < m * n:
            result[i] = matrix[row][col]
            if direction == 1:
                if col == n - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
            i = i + 1
        return result

