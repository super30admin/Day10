#Time Complexity : O(n)
#Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        res = []
        dir = True
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        while r < m and c < n:
            res.append(mat[r][c])
            if dir:
                if c == n-1:
                    dir = False
                    r +=1
                elif r==0:
                    dir = False
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if r == m-1:
                    dir = True
                    c+=1
                elif c == 0:
                    dir = True
                    r+=1
                else:
                    r+=1
                    c-=1
        return res




