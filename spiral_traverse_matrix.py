"""
Array-1

Problem3 (https://leetcode.com/problems/spiral-matrix/)

Time Complexity : O(mxn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is setting up 4 variables top, left, right, bottom i.e.
top -> starting row
bottom -> last row
left -> staring col
right -> last col
Now write loops for left-right, top-bottom, right-left, bottom-top and increment it's
respective variables. 
Don't forget to add edge condition of check whether top is exceeding bottom or left is exceeding right
whenever you increment the variables and access them in the next for loop.
"""

# Approach 1
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []


        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0 # starting row
        bottom = m - 1 # last row
        left = 0 # starting col
        right = n - 1 # last col

        # while len(result) < m*n:
        while top <= bottom and left <= right:
            # move from left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1

            if top <= bottom:
                # move from top to bottom
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1

            if top <= bottom and left <= right:
                # move from right to left
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if top <= bottom and left <= right:
                # move from bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
    

# Approach 2
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []


        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0 # starting row
        bottom = m - 1 # last row
        left = 0 # starting col
        right = n - 1 # last col

        # while len(result) < m*n:
        while top <= bottom and left <= right:
            # move from left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1

            # move from top to bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                # move from right to left
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                # move from bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result