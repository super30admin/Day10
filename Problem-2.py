'''
    Time Complexity: O(mn)
    Space Complexity: O(1)
    Ran successfully on leetcode
    Approach: Simulate the traversal using a direction flag,  row and column pointer and handle the edge cases.
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        r, c = 0, 0
        upDir = True

        for i in range(0, m*n):
            result.append(mat[r][c])

            if upDir:
                if c == n-1:
                    r += 1
                    upDir = False
                elif r == 0:
                    c += 1
                    upDir = False
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    upDir = True
                elif c == 0:
                    r += 1
                    upDir = True
                else:
                    r += 1
                    c -= 1

        return result