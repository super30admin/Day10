from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])

        left, right, top, bottom = 0, n - 1, 0, m - 1
        res = []
        while top <= bottom and left <= right:
            # move from top left to top right
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            # move from top right to bottom right
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            # move from bottom right to bottom left
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1

            # move from bottom left to top left
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1

        return res


if __name__ == "__main__":
    sol = Solution()
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    result = sol.spiralOrder(matrix)
    assert result == [1, 2, 3, 6, 9, 8, 7, 4, 5]
