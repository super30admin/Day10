"""

    Approach: Use a boolean flag 'isUp' to determine the direction of the diagonal traversal. Starting from the top left corner, 
        traverse upward until an edge of the matrix is reached, then switch to downward diagonal traversal upon hitting
        boundaries. Specific boundary conditions adjust the direction and start position for the next diagonal traversal.

    Time Complexity: O(m*n)

    Space Complexity: O(1)

    Accepted on LeetCode? Yes! 
    LeetCode Link: https://leetcode.com/problems/diagonal-traverse/
"""

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        count = 0
        i = j = 0
        isUp = True
        res = []

        while count < m * n:
            res.append(mat[i][j])
            count += 1

            if isUp:
                if j == n - 1:
                    i += 1
                    isUp = not isUp
                elif i == 0:
                    j += 1
                    isUp = not isUp
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    j += 1
                    isUp = not isUp
                elif j == 0:
                    i += 1
                    isUp = not isUp
                else:
                    i += 1
                    j -= 1

        return res


if __name__ == "__main__":
    sol = Solution()
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    result = sol.findDiagonalOrder(matrix)

    print(f"{result=}")
    assert result == [1, 2, 4, 7, 5, 3, 6, 8, 9]
