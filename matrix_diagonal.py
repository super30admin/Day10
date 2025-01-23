#time_complexity = o(m*n)
#space complexity = o(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m * n)
        index = 0
        r, c = 0, 0
        direction = 1  
        
        while index < m * n:
            result[index] = mat[r][c]
            index += 1
            
            if direction == 1:  
                if c == n - 1:
                    r += 1
                    direction = -1
                elif r == 0:
                    c += 1
                    direction = -1
                else:
                    r -= 1
                    c += 1
            
            else:  
                if r == m - 1:
                    c += 1
                    direction = 1
                elif c == 0:
                    r += 1
                    direction = 1
                else:
                    r += 1
                    c -= 1
        
        return result
