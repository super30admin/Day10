class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []

        m, n = len(mat), len(mat[0])
        res = []
        dir = 1  # 1 for upward, -1 for downward

        r, c = 0, 0
        while len(res) < m * n:
            res.append(mat[r][c])

            if dir == 1:  # Moving upward
                if c == n - 1:  # Reached the right boundary, move down
                    r += 1
                    dir = -1
                elif r == 0:  # Reached the top boundary, move right
                    c += 1
                    dir = -1
                else:  # Move up diagonally
                    r -= 1
                    c += 1
            else:  # Moving downward
                if r == m - 1:  # Reached the bottom boundary, move right
                    c += 1
                    dir = 1
                elif c == 0:  # Reached the left boundary, move down
                    r += 1
                    dir = 1
                else:  # Move down diagonally
                    r += 1
                    c -= 1

        return res
    # T: O(m * n), S: O(1)