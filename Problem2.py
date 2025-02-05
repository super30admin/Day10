# Problem 2 - Diagonal Traverse
# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
In this case, we need to handle both upward and downward directions for all elements. When moving upward, if the element is 
on the top border, we increment the row and change direction. If it's on the left border, we increment the column and change 
direction; otherwise, we increment the column and decrement the row. We will apply the same approach when moving downward.
'''
# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        rowLength = len(matrix)
        colLength = len(matrix[0])
        answer = []
        # Checking for empty matrix
        if matrix == []:
            return answer
        # Calculating the two number in the matrix
        index = rowLength * colLength
        i = j = 0
        # booelan variable for storing the status of direction
        up = True

        while index:
            index -= 1
            answer.append(matrix[i][j])
            # Checking for upward direction
            if up:
                # Checking if the element is at right border and if yes change direction and increment the row
                if j == colLength - 1:
                    i += 1
                    up = False
                # Checking if the element is at top border and if yes change direction and increment the column
                elif i == 0:
                    j += 1
                    up = False
                # Increment the column and decrement the row
                else:
                    i -= 1
                    j += 1
            # Downward direction 
            else:
                # Checking if the element is at bottom border and if yes change direction and increment the column
                if i == rowLength - 1:
                    up = True
                    j += 1
                # Checking if the element is at left border and if yes change direction and increment the row
                elif j == 0:
                    i += 1
                    up = True
                # Increment the row and decrement the column
                else:
                    i += 1
                    j -= 1
        return answer
       