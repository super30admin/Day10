# Time Complexity O(m*n)
# Space Complexity O(1)

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) ==0 :
            return []
        m = len(mat)
        n = len(mat[0])
        index = 0
        direction = 1
        result = []
        row , col = 0,0
        while len(result) < m*n:
            result.append(mat[row][col])
            if direction == 1:
                if col == n-1:
                    direction = -1
                    row = row + 1
                elif row == 0:
                    direction = -1
                    col = col +1
                else:
                    row -= 1
                    col += 1
            elif direction == -1:
                if row == m-1:
                    direction = 1
                    col = col + 1
                elif col == 0:
                    direction = 1
                    row = row +1
                else:
                    row = row + 1
                    col = col - 1
        return result
            

