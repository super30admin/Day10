# TC: O(M x N) where M = rows of matrix and N = columns of matrix
# SC: O(1) since we are using the input matrix to perform operations.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        rows = len(matrix)
        cols = len(matrix[0])
        top = 0
        bottom = rows - 1
        left = 0
        right = cols - 1
        
        while top <= bottom and left <= right:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            
            for j in range(top, bottom + 1):
                result.append(matrix[j][right])
            right -= 1
            
            if top <= bottom and left <= right:
                for k in range(right, left - 1, -1):
                    result.append(matrix[bottom][k])
                bottom -= 1
            
            if top <= bottom and left <= right:
                for l in range(bottom, top -1, -1):
                    result.append(matrix[l][left])
                left += 1
            
        return result
