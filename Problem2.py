class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        m = len(mat)
        n = len(mat[0])
        res = []
        dir_up = True
        r, c = 0, 0
        
        for i in range(m*n):
            res.append(mat[r][c])
            if dir_up:
                if c == n-1:
                    r+=1
                    dir_up = False

                elif r == 0:
                    c+=1
                    dir_up = False
                else:
                    c+=1
                    r-=1

            else:
                if r == m-1:
                    c+=1
                    dir_up = True
                elif c == 0:
                    r+=1
                    dir_up = True
                else:
                    c-=1
                    r+=1
        
        return res
            
        
        