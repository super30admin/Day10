# time: O(m*n) Space: O(1)


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        m = len(matrix)
        n = len(matrix[0])

        res = []
        l = 0
        r = n - 1

        ceiling = 0
        floor = m - 1
        while (ceiling <= floor and l <= r):
            if (ceiling <= floor and l <= r):
                for i in range(l, r + 1):
                    res.append(matrix[ceiling][i])
                ceiling += 1
            if (ceiling <= floor and l <= r):
                for i in range(ceiling, floor + 1):
                    res.append(matrix[i][r])
                r -= 1
            if (ceiling <= floor and l <= r):
                for i in range(r, l - 1, -1):
                    res.append(matrix[floor][i])
                floor -= 1
            if (ceiling <= floor and l <= r):
                for i in range(floor, ceiling - 1, -1):
                    res.append(matrix[i][l])
                l += 1
        return res
