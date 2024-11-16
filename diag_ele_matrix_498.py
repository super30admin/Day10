#O(mn) sc o(min(m,n))
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        q = deque([(0, 0)])
        rows, cols = len(mat), len(mat[0])
        ans = []
        reverse = False

        while q:
            level = []
            for _ in range(len(q)):
                row, col = q.popleft()
                level.append(mat[row][col])

                if col == 0 and row + 1 < rows:
                    q.append((row + 1, col))
                if col + 1 < cols:
                    q.append((row, col + 1))

            if reverse:
                ans.extend(level[::-1])
            else:
                ans.extend(level)
            reverse = not reverse

        return ans
