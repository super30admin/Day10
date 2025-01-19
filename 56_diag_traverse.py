# Time complexity - O(m * n)
# Space complexity - O(1)

# Approach - Individually lay out the conditions that need to be followed for traversing, 
# using two directions up and down

from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        dir = 1 # maintain two directions: 1 and -1
        r = 0 # row
        c = 0 # col
        result = [0 for i in range(m * n)]
        i = 0 # index of result array

        while i < m * n:
            result[i] = mat[r][c]
            i += 1 
            if dir == 1:
                if c == n - 1:
                    r += 1
                    dir = -1
                
                elif r == 0:
                    c += 1
                    dir = -1
                
                else:
                    r -= 1
                    c += 1
            
            elif dir == -1:
                if r == m - 1:
                    c += 1
                    dir = 1
                
                elif c == 0:
                    r += 1
                    dir = 1
                
                else:
                    r += 1
                    c -= 1
        
        return result