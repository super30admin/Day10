"""
Array approach -
TC = O(m * n)
SC = O(1)
"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix) == 0: return []

        m = len(matrix)
        n = len(matrix[0])

        rtnArr = [None] * (m * n)

        top = 0
        bottom = m - 1
        left = 0
        right = n - 1

        count = 0

        while top <= bottom and left <= right:
            # move from left to right
            for i in range(left, right + 1):
                rtnArr[count] = matrix[top][i]
                count += 1
            top += 1

            # move from top to bottom
            for i in range(top, bottom + 1):
                rtnArr[count] = matrix[i][right]
                count += 1
            right -= 1

            # move from right to left
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    rtnArr[count] = matrix[bottom][i]
                    count += 1
                bottom -= 1

            # move from bottom to top
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    rtnArr[count] = matrix[i][left]
                    count += 1
                left += 1

        return rtnArr
