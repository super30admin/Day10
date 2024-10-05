#T.C = O(m*n) S.C = O(m*n)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m*n)
        r = 0
        c = 0
        dir = True
        
        for i in range(m*n):
            result[i] = mat[r][c]
            if(dir):
                if(c == n-1):
                    r+=1
                    dir=False
                elif(r==0):
                    c+=1;dir=False
                else:
                    r-=1;c+=1
            else:
                if(r == m-1):
                    c+=1;dir=True
                elif(c==0):
                    r+=1;dir=True
                else:
                    r+=1;c-=1

        return result
        