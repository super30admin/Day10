# The approach uses O(m * n) time complexity, where m and n are the matrix dimensions.  
# It traverses the matrix diagonally, alternating between upward and downward directions,  
# adjusting row and column indices based on boundary conditions to fill the result array.  
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return []
        
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m * n)]
        index = 0  # to track position in result
        r = 0  # row
        c = 0  # column
        Dir = 1  # direction: 1 means up, -1 means down
        
        while index < m * n:
            result[index] = mat[r][c]
            index += 1
            
            if Dir == 1:
                if c == n - 1:
                    r += 1
                    Dir = -1
                elif r == 0:
                    c += 1
                    Dir = -1
                else:
                    r -= 1
                    c += 1
            elif Dir == -1:
                if r == m - 1:
                    c += 1
                    Dir = 1
                elif c == 0:
                    r += 1
                    Dir = 1
                else:
                    r += 1
                    c -= 1
        
        return result
