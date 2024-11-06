# TC: O(m*n)
# SC: O(1)
# The code compiled on LC successfully

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        col = len(mat[0])
        res = []
        dir = True
        r = 0
        c = 0

        for i in range(row*col):
                res.append(mat[r][c])
                if dir == True:
                    if r == 0 and c != col - 1:
                        c += 1
                        dir = False
                    elif c == col - 1:
                        r += 1
                        dir = False
                    else:
                        r -= 1
                        c += 1
                else:
                    if c == 0 and r != row - 1:
                        r += 1
                        dir = True
                    elif r == row - 1:
                        c += 1
                        dir = True
                    else:
                        r += 1
                        c -= 1
        return res
        
