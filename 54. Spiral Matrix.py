## Time complexity - O(m * n)

## space complexity - O(1) (Output Array)

## traverse from left to right, update pointer of top to +1
## traverse from top to bottom, update pointer of right to -1
## traverse from right to left, update pointer of bottom to -1
## traverse from bottom to top, until u hit the top, update point of left to +1

## at any point left & right or top & bottom cross each other, we break out of our loop


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        result = []

        left, right = 0, len(matrix[0])
        top, bottom = 0, len(matrix)

        while left < right and top < bottom:

            for i in range(left, right):
                result.append(matrix[top][i])
            top += 1

            for i in range(top, bottom):
                result.append(matrix[i][right-1])
            right -= 1

            if not (left < right and top < bottom):
                break

            for i in range(right -1, left - 1, -1):
                result.append(matrix[bottom-1][i])
            bottom -= 1

            for i in range(bottom -1, top - 1, -1):
                result.append(matrix[i][left])
            left += 1

        return result
