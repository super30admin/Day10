"""
Time Complexity: O(m*n)
Space Complexity: O(1)
"""

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        m = len(mat)
        n = len(mat[0])
        index = 0
        flag = True
        r, c = 0,0

        result = []

        while(index < m*n):
            result.append(mat[r][c])
            index += 1

            if flag:
                if c == n-1:
                    r += 1
                    flag = False

                elif r == 0:
                    c += 1
                    flag = False
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    flag = True
                elif c == 0:
                    r += 1
                    flag = True
                else:
                    r += 1
                    c -= 1
        return result

        