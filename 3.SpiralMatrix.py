"""
Time Complexity: 0(mn)
Space Complexity: 0(1)
Approach: Use 4 ptrs and update them conditionally
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        count = len(matrix) * len(matrix[0])

        top = 0
        bottom = len(matrix) - 1

        left = 0
        right = len(matrix[0]) - 1

        # return result
        result = []

        while True:

            # left to right
            for i in range(left,right+1,1):
                result.append(matrix[top][i])
                count -= 1
            top += 1

            if count <= 0:
                break
            
            # top to bottom
            for i in range(top, bottom+1, 1):
                result.append(matrix[i][right])
                count -= 1
            right -= 1

            if count <= 0:
                break
            
            # right to left
            for i in range(right, left-1, -1):
                result.append(matrix[bottom][i])
                count -= 1
            bottom -= 1

            if count <= 0:
                break
            
            # bottom to top
            for i in range(bottom, top-1, -1):
                result.append(matrix[i][left])
                count -= 1
            left += 1

            if count <= 0:
                break
        
        # end of while loop

        return result

