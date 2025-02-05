# Problem 2 - Spiral Matrix
# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
n this problem, we will move in four directions: right, down, left, and up. After each movement, we must update the top, bottom, 
left, and right borders of the matrix. Since the borders are updated within the while loop, it's necessary to recheck the border 
conditions after each update.
'''
# Your code here along with comments explaining your approach

from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        # Initialize boundaries
        topBorder, bottomBorder = 0, len(matrix) - 1, 
        leftBorder, rightBorder = 0, len(matrix[0]) - 1

         # While loop will run until the left border is not crossing right border and top border is not crossing bottom border
        while topBorder <= bottomBorder and leftBorder <= rightBorder:
            # Move in right direction
            for i in range(leftBorder, rightBorder + 1):
                result.append(matrix[topBorder][i])
            topBorder += 1

            # Move in down direction
            for i in range(topBorder, bottomBorder + 1):
                result.append(matrix[i][rightBorder])
            rightBorder -= 1

            # Move in right direction
            if topBorder <= bottomBorder:
                for i in range(rightBorder, leftBorder - 1, -1):
                    result.append(matrix[bottomBorder][i])
                bottomBorder -= 1

            # Move in up direction
            if leftBorder <= rightBorder:
                for i in range(bottomBorder, topBorder - 1, -1):
                    result.append(matrix[i][leftBorder])
                leftBorder += 1

        return result


        