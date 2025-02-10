"""
Array approach -
TC = O(m * n)
SC = O(1)
"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0: return []

        m = len(mat)
        n = len(mat[0])

        rtnArr = [None] * (m * n)
        # start with upward direction
        dir = 1

        r = 0
        c = 0

        # rtnArray idx
        idx = 0

        while idx < len(rtnArr):
            rtnArr[idx] = mat[r][c]
            idx += 1

            if dir == 1:
                if c == n - 1:
                    dir = -1
                    r += 1
                elif r == 0:
                    c += 1
                    dir = -1
                else:
                    # general case
                    r -= 1
                    c += 1
            else:  # dir = -1
                if r == m - 1:
                    c += 1
                    dir = 1
                elif c == 0:
                    r += 1
                    dir = 1
                else:  # general
                    r += 1
                    c -= 1

        return rtnArr