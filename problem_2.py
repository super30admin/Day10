"""
Problem Statement: Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
TC: O(m*n) SC: O(1)
Approach: Traverse the matrix in the diagonal order and keep track of the direction of traversal.
"""

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        m = len(mat)
        n = len(mat[0])
        dir_ = 1
        index = 0
        r , c =0 ,0
        while index < m* n:
            result.append(mat[r][c])
            if dir_ == 1:
                if c == n - 1:
                    r += 1
                    dir_ = 0
                elif r == 0:
                    c += 1
                    dir_ = 0
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    c += 1
                    dir_ = 1
                elif c == 0:
                    r += 1
                    dir_ = 1
                else:
                    r += 1
                    c -= 1

            index += 1
        return result