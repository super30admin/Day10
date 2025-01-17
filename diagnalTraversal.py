class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        Dir = 1
        i = 0
        r = 0
        c = 0
        result = [0 for i in range(m*n)]
        while (i < m*n):
            result[i] = mat[r][c]
            i = i + 1
            if Dir == 1:
                if c == n - 1:
                    r = r + 1
                    Dir = -1
                elif r == 0:
                    c = c + 1
                    Dir = -1
                else:
                    r = r - 1
                    c = c + 1
            elif Dir == -1:
                if r == m - 1:
                    c = c + 1
                    Dir = 1
                elif c == 0:
                    r = r + 1
                    Dir = 1
                else:
                    r = r + 1
                    c = c - 1
        return result
#-------------------Time: O(mn), Space = O(1)------------Must watch lecture