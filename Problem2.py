class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        m = len(mat)
        n = len(mat[0])

        result = [int]*(m*n)
        print(result)
        r = 0
        c = 0
        up_dir = True

        for i in range(0, m*n):
            result[i] = mat[r][c]
            if up_dir:
                if r == 0 and c != n-1:
                    c +=1
                    up_dir = False
                elif c == n-1:
                    r += 1
                    up_dir = False
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0 and r != m-1:
                    r += 1
                    up_dir = True
                elif r == m-1:
                    c += 1
                    up_dir = True
                else:
                    r += 1
                    c -= 1

        return result


