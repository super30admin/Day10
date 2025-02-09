# Time: O(m*n)
# Space: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = 0 # 0:up 1: down
        m = len(mat)
        n = len(mat[0])
        i = 0
        j = 0
        ele = 0
        result = []
        while ele < m*n:
            result.append(mat[i][j])
            if dir == 0: # up
                if j == n-1:
                    i += 1
                    dir = 1
                elif i == 0:
                    j += 1
                    dir = 1
                else:
                    i -= 1
                    j += 1
            else: # down
                if i == m-1:
                    j += 1
                    dir = 0
                elif j == 0:
                    i += 1
                    dir = 0
                else:
                    j -= 1
                    i += 1
            ele += 1
        return result

        