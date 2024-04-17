#TC: O(M*N)
#SC: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        dir = True
        result = []
        r,c= 0,0

        for i in range(m*n):
            result.append(mat[r][c])

            if dir:
                if (r==0 and c!=n-1):
                    c+=1
                    dir=False
                elif (c==n-1):
                    r+=1
                    dir = False
                else:
                    c+=1
                    r-=1
            else:
                if (r==m-1):
                    c+=1
                    dir = True
                elif (c==0 and r!=m-1):
                    r+=1
                    dir = True
                else: 
                    c-=1
                    r+=1
        return result
