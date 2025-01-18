# Using 4 pointers for left, right, top and bottom. we can traverse until we reach end of each row and then column in a spiral way
# TC: O(m*n)
# SC: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return []
        res = []
        m = len(matrix)
        n = len(matrix[0])
        top, left, bottom, right = 0, 0, m - 1, n - 1
        while top <= bottom and left <= right:
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res
