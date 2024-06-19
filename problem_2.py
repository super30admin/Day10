# Time O(m*n)
# Space O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # base 
        if mat is None and mat[0] is None:
            return []
        # dim 
        m, n = len(mat), len(mat[0])
        row, col = 0, 0
        result = []
        up = True 
        while len(result) < m * n:
            result.append(mat[row][col])

            if up:
                if col == n - 1: 
                    # hit left, go down
                    row += 1
                    up = False
                elif row == 0:
                    # hit up, go right
                    col += 1
                    up = False
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    # hit down, go left 
                    col += 1
                    up = True
                elif col == 0:
                    # hit left, go down 
                    row += 1
                    up = True 
                else:
                    row += 1
                    col -= 1
        return result 

        