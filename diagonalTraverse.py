class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # TC: O(m*n)
        # SC: O(1) bcoz res array is not considered
        if mat is None or len(mat) == 0:
            return 0
        m,n = len(mat),len(mat[0])
        res = []
        index = 0
        row,col = 0,0
        direction = 1
        # 1: bottom to top; -1: top to bottom
        while len(res) < m*n:
            res.append(mat[row][col])
            if direction == 1:
                if col == n-1 :
                    direction = -1
                    row += 1
                elif row == 0:
                    direction = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            elif direction == -1:
                if row == m-1:
                    direction = 1
                    col += 1
                elif col == 0:
                    direction = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return res
        