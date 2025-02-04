# https://leetcode.com/problems/spiral-matrix/description/

# Time Complexity : O(mn)
# Space Complexity : O(mn)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1

        result  = []

        while left <= right and top <= bottom:
            #top row
            for j in range(left,right+1):
                result.append(matrix[top][j])
            top+=1

            # right column
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right-=1
            
            #bottom row
            if(top<=bottom):
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom-=1

            # left column
            if(left<=right):
                for i in range(bottom, top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        
        return result
        