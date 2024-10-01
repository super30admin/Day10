# 498. Diagonal Traverse
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        output = []
        upDir = True

        r = 0
        c = 0

        for i in range(m*n):
            output.append(mat[r][c])

            if upDir:
                if r == 0 and c != n-1:
                    upDir = False
                    c += 1
                elif c == n-1:
                    upDir = False
                    r += 1
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0 and r != m-1:
                    upDir = True
                    r += 1
                elif r == m-1:
                    upDir = True
                    c += 1
                else:
                    r += 1
                    c -= 1
                
        
        return output

                





        