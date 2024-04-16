#Array-1
## Problem 2
#Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Approach
# As this is a simulation problem, having direction var is important. initialize it to True. Set row, col to 0. m is number of rows and n is number of columns in the matrix
# Traverse through the matrix and based on the direction, set conditions. If dir = True, check if pointer is at last column. If yes, move the pointer to next row. If pointer is at 1st row, move col pointer to next column
# Similarly, if dir = False and row pointer is at last row, move col pointer to next col and if col pointer is on 1st col, move row pointer to next. Append the element value to result and return


# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        if len(mat)==0:
            return []

        dir = True
        m = len(mat)
        n = len(mat[0])
        res = [0 for i in range(m*n)]
        row= 0
        col = 0

        print('res', res)

        for i in range(m*n):
            res[i] = mat[row][col]

            if dir == True:
                if col == n-1:
                    row += 1
                    dir = False

                elif row == 0:
                    col += 1
                    dir = False

                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    col += 1
                    dir = True
                
                elif col == 0:
                    row += 1
                    dir = True

                else:
                    col -= 1
                    row += 1
        return res