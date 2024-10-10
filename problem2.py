# time complexity: O(m*n)
# space complexity: O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])

        result = [0]*(m*n)
        r, c = 0, 0
        updir = True

        for i in range(0, m*n):
            result[i] = mat[r][c]

            if updir:
                if c==n-1:
                    r += 1
                    updir =False
                elif r==0:
                    c+=1
                    updir=False
                else:
                    r-=1
                    c+=1
            else:
                if r==m-1:
                    c+=1
                    updir=True
                elif c==0:
                    r+=1
                    updir=True
                else:
                    r+=1
                    c-=1
        return result