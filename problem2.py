# Time Complexity : O(n*m), n->rows m->cols
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        R,C = len(mat), len(mat[0])
        is_up = True
        res = []

        i,j = 0,0
        while i < R and j < C:
            print(i,j)
            res.append(mat[i][j])
            if is_up:
                if j == C-1:
                    i += 1
                    is_up = False
                elif i == 0:
                    j += 1
                    is_up = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == R-1:
                    j += 1
                    is_up = True
                elif j == 0:
                    i += 1
                    is_up = True
                else:
                    i += 1
                    j -= 1
                    
        
        return res