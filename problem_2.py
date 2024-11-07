# TC: O(m*n)
# SC: O(1)

def findDiagonalOrder(mat):
    m = len(mat)
    n = len(mat[0])
    dir = True
    r, c = 0, 0
    result = []
    for i in range(m*n):
        result.append(mat[r][c])
        if dir:
            # up direction
            if r == 0 and c != n - 1:
                c += 1
                dir = False
            elif c == n-1:
                r += 1
                dir = False
            else:
                r -= 1
                c += 1
        else:
            if (c == 0 and r !=m-1):
                r += 1
                dir = True
            elif r == m-1:
                c += 1
                dir = True
            else:
                r += 1
                c -= 1

    return result
            # down direction

mat = [[1,2,3],[4,5,6],[7,8,9]]
print(findDiagonalOrder(mat))