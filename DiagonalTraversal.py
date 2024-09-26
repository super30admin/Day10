# TC: O(M x N) where M is the rows of the matrix and N is the col of matrix. If M = N, then N^2.
# SC: O(1) since we are using the output array to store the traversal. 

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        rows = len(mat)
        cols = len(mat[0]) 
        direc = 1
        r = c = 0
        i = 0
        
        while r < (rows) and (c < cols):
            result.append(mat[r][c])
            if direc == 1:
                if c == cols - 1:
                    r += 1
                    direc = -1
                elif r == 0:
                    c += 1
                    direc = -1
                else:
                    c += 1
                    r -= 1
            else:
                if r == rows - 1:
                    c += 1
                    direc = 1
                elif c == 0:
                    r += 1
                    direc = 1
                else:
                    c -= 1
                    r += 1
        return result
