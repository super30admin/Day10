# Time Complexity : O(m * n)
# Space Complexity : O(m * n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Diagonal Traverse

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])

        result = [0] * (m * n)
        r , c = 0, 0
        upDir = True
        for i in range(m * n):
            result[i] = mat[r][c]
            if upDir:
                if c == n - 1:
                    r += 1
                    upDir = False
                elif r == 0:
                    c += 1
                    upDir = False
                else:
                    r -= 1
                    c += 1
            elif not upDir:
                if r == m - 1:
                    c += 1
                    upDir = True
                elif c == 0:
                    r += 1
                    upDir = True
                else:
                    r += 1
                    c -= 1
        return result

                

        

        