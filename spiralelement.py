class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        result = []
        while (top <= bottom and left <= right):
            # top row 
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top = top + 1

            # Right col 
            for j in range(top, bottom + 1):
                result.append(matrix[j][right])
            right = right - 1

            # Bottom row
            if (top <= bottom):
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom = bottom - 1

            # Left col
            if (left <= right):
                for j in range(bottom, top - 1, -1):
                    result.append(matrix[j][left])
                left = left + 1

        return result
# Time = O(mn), Space = O(1) 
        