#Time Complexity : O(m*n)
#Space Complexity : O(m*n)
#Did this code successfully run on Leetcode : Yes
#Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #Initialise all required variables
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        left = 0
        bottom = m - 1
        right = n - 1
        #Check no pointers go out of bond so that the algo knows that the path is done
        while top <= bottom and left <= right:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            #We check it here again as we incremented top previosuly
            if(top <= bottom):
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            #We check it here again as we decremented right previosuly
            if(left <= right):
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
