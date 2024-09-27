'''
Sol 1:
Time Complexity :O(min(m,n) * n )
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation:
Iteration 1 - Iterates through top row and the right column, iteration -2 - iterates through bottom row and left column
all that is left is center and adds that to the list.

Sol 2(Preferred):
Time Complexity :O(m * n )
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation:
Use pointers left,right, top, down to keep track of the spiral. First move from left -> right and once done increase top by 1
then in the last column move from top to bottom then decrease right column by 1 the we need to go from right to left on the bottom
row and then move bottom to top on the left side. Keep doing this till left<=right and top<=down
'''

class Solution:
            def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
                l = []
                if len(matrix) == 0 or matrix == None:
                    return []

                if len(matrix) == 1:
                    return matrix[0]

                m = len(matrix) - 1
                n = len(matrix[0])
                top = left = 0
                down = len(matrix) - 1

                right = len(matrix[0]) - 1

                while top <= down and left <= right:
                    # left - right
                    for i in range(left, right + 1):
                        l.append(matrix[top][i])
                    top = top + 1
                    # top - bottom
                    for i in range(top, down + 1):
                        l.append(matrix[i][right])

                    right = right - 1
                    # left -- right
                    if top <= down:
                        i = right
                        while i >= left:
                            l.append(matrix[down][i])
                            i -= 1
                    down -= 1

                    if left <= right:
                        i = down
                        while i >= top:
                            l.append(matrix[i][left])
                            i -= 1
                    left += 1

                return l

            def customspiralOrderCustom(self, matrix: List[List[int]]) -> List[int]:
                l = []
                if len(matrix) == 0 or matrix == None:
                    return []

                if len(matrix) == 1:
                    return matrix[0]

                M, N = len(matrix), len(matrix[0])
                m = n = 0
                k = 0
                maxValue = min(M, N)
                while k < maxValue:
                    if k % 2 == 0:
                        for j in range(n, N):
                            l += [matrix[m][j]]
                        for i in range(m + 1, M):
                            l += [matrix[i][N - 1]]
                        m = m + 1
                        N = N - 1
                    else:
                        for j in reversed(range(n, N)):
                            l += [matrix[M - 1][j]]

                        for i in reversed(range(m, M - 1)):
                            l += [matrix[i][n]]
                        n, M = n + 1, M - 1
                    k = k + 1

                return l

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l = []
        if len(matrix) == 0 or matrix == None:
            return []

        if len(matrix) == 1:
            return matrix[0]

        M, N = len(matrix), len(matrix[0])
        m = n = 0
        k = 0
        maxValue = min(M, N)
        while k < maxValue:
            if k % 2 == 0:
                for j in range(n, N):
                    l += [matrix[m][j]]
                for i in range(m + 1, M):
                    l += [matrix[i][N - 1]]
                m = m + 1
                N = N - 1
            else:
                for j in reversed(range(n, N)):
                    l += [matrix[M - 1][j]]

                for i in reversed(range(m, M - 1)):
                    l += [matrix[i][n]]
                n, M = n + 1, M - 1
            k = k + 1

        return l
