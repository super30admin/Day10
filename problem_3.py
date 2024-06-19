# Time O(M*N)
# Space O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or matrix[0] is None:
            return matrix 
        m = len(matrix)
        n = len(matrix[0])
        top, bottom = 0, m - 1
        left, right = 0 , n - 1
        result = []
        while (top <= bottom and left <= right):
            # move left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            # move top to bottom 
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            # move right to left 
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            # move bottom to top
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
        