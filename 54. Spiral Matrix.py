#TC O(m*n) and SC O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0:
            return []
        m = len(matrix) #rows
        n = len(matrix[0]) #cols
        result = []
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        while top <= bottom and left <= right:
            #moving from left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top = top + 1
            #moving from top to bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right = right - 1
            #because top was modified we will check below condition again
            if top <= bottom:
                #moving from right to left
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1
            #because right was modified we will check below condition again
            if left <= right:
                #moving from bottom to top
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left = left + 1
        return result

