"""

Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Time Complexity : O(M*N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# This function traverses a 2D matrix in a diagonal order, alternating between moving up-right and down-left.  
# It uses a direction flag to track movement and adjusts row/column indices when hitting boundaries.  
# The traversal continues until all elements are added to the result list.  


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        m, n = len(mat), len(mat[0])
        r, c = 0, 0
        res = []
        direct = 1  # 1 means moving up-right, -1 means moving down-left

        while len(res) < m * n:
            res.append(mat[r][c])
            
            new_r = r + (-1 if direct == 1 else 1)
            new_c = c + (1 if direct == 1 else -1)

            if new_r < 0 or new_r == m or new_c < 0 or new_c == n:
                if direct == 1:
                    if c == n - 1:  # If at the last column, move down
                        r += 1
                    else:  # Otherwise, move right
                        c += 1
                else:
                    if r == m - 1:  # If at the last row, move right
                        c += 1
                    else:  # Otherwise, move down
                        r += 1
                direct = -direct  # Toggle direction
            else:
                r = new_r
                c = new_c

        return res
