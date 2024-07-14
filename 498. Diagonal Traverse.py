#TC O(m*n) and SC O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        index = 0
        row = 0
        col = 0
        dir = 1 #direction bottom to top -> 1 and top to bottom is -1
        while index < m * n:
            result[index] = mat[row][col]
            index = index + 1
            if dir == 1:
                if col == n-1:
                    dir = -1
                    row = row + 1
                elif row == 0:
                    dir = -1
                    col = col + 1
                else:
                    row = row - 1
                    col = col + 1
            elif dir == -1:
                if row == m-1:
                    dir = 1
                    col = col + 1
                elif col == 0:
                    dir = 1
                    row = row + 1
                else:
                    row = row + 1
                    col = col - 1
        return result


