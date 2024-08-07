# Time complexity - O(m*n)
# Space complexity - O(1)
# Take care of the base case of while changing isside the loop
# insert additional conditions.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = left = 0
        bottom = len(matrix) - 1
        right = len(matrix[0]) - 1
        result = []

        while (top <= bottom and left <= right):

            result.extend(matrix[top][left:right+1])
            top += 1

            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            if (top <= bottom):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            if (left <= right):
                for i in range(bottom, top-1,-1):
                    result.append(matrix[i][left])
                left += 1

        return result

