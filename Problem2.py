# Keep a direction variable and if direction is 1 go bottom to top and if it's -1 go from top to bottom
# While doing this keep updating res array with the number if row hits 0 increment column and if column hits n-1 decrement row. Similarly in the opposite direction too"
# TC: O(m*n)
# SC: O(1)


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        res = [0] * (m * n)
        index, row, col = 0, 0, 0
        dir = 1
        while index < m * n:
            res[index] = mat[row][col]
            index += 1
            if dir == 1:
                if col == n-1:
                    dir = -1
                    row += 1
                elif row == 0:
                    dir = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return res