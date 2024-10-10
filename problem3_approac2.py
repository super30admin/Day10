# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        m = len(matrix)
        n = len(matrix[0])

        result = []

        top, bottom = 0, m - 1
        left, right = 0, n - 1

        self.helper(matrix, top, bottom, left, right, result)

        
        return result

    def helper(self, matrix: List[List[int]], top: int, bottom: int, left: int, right: int, result: List[int]):
        if top <= bottom and left <= right:
            # Traverse from left to right along the top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # Traverse from top to bottom along the right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                # Traverse from right to left along the bottom row
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                # Traverse from bottom to top along the left column
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

            self.helper(matrix, top, bottom, left, right, result)