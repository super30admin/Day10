# Time O(n*m)
# Space: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix[0])
        m = len(matrix)
        top = 0
        right = n-1
        left = 0
        bottom = m-1
        result = []
        while left <= right and top <= bottom :
            # top - right
            for j in range(top, right+1, 1):
                result.append(matrix[top][j])
            top += 1

            # right down
            for i in range(top, bottom+1, 1):
                result.append(matrix[i][right])
            right -= 1

            #bottom - left
            if top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
            bottom -= 1

            #left - top
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
            left += 1

        return result
            
