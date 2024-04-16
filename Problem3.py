## Problem 3
#Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Approach
# Create 4 pointers for top, bootm, left and right of the matrix. Run the loop while top<=bootm and left<=right.
# For each row and column traversal in the matrix, check the above condition. While traversing from top to bottom, once done set right -=1
# While traversing left to right, once done set top += 1. WHile traversing right to left, once done set bottom -=1 and while traversing bottom to top, once done set left += 1


# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return []

        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        res = []
        print('res',res)

        while(top <= bottom and left <=right):
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
         
            if (top <= bottom and left <=right):
                for j in range(top, bottom+1):
                    res.append(matrix[j][right])
                right -= 1
               
            if (top <= bottom and left <=right):
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1

            if (top <= bottom and left <=right):
                for j in range(bottom,top-1,-1):
                    res.append(matrix[j][left])
                left += 1

        return res