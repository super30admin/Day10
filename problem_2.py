#  Problem: https://leetcode.com/problems/diagonal-traverse/description/
#  Time complexity: O(m*n)
#  Space complexity: O(1)

#  Did this code successfully run on Leetcode : Yes


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None  or len(mat) == 0:
            return []

        n = len(mat[0])
        m = len(mat)
        res = [0] * (m*n)

        index = 0 
        row = 0
        col = 0 
        dir = 1

        while index < m*n:
            res[index] = mat[row][col]
            index += 1

            if dir == 1:
                if col == n-1:
                    dir = -1
                    row += 1
                
                elif row == 0:
                    dir = -1
                    col += 1
                
                else:
                    row -= 1
                    col += 1
            
            else:
                if row == m-1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row +=1
                    col -=1
        return res

