"""
Array-1

Problem2 (https://leetcode.com/problems/diagonal-traverse/)

Time Complexity : O(mxn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is First write else conditions for both directions and then form the if else conditions for the boundaries.
"""

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or len(mat) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        dir = 1
        row = 0
        col = 0
        result = []

        while len(result) < m*n:
            if dir == 1:
                if col == n-1: # col check so that it can't be skipped in row check
                    result.append(mat[row][col])
                    row += 1
                    dir = -1
                elif row == 0:
                    result.append(mat[row][col])
                    col += 1
                    dir = -1
                else:
                    result.append(mat[row][col])
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    result.append(mat[row][col])
                    col += 1
                    dir = 1
                elif col == 0:
                    result.append(mat[row][col])
                    row += 1
                    dir = 1
                else:
                    result.append(mat[row][col])
                    row += 1
                    col -= 1

        return result


            
