# time: O(mn)
# space: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        i, j = 0, 0
        r, c = len(mat), len(mat[0])
        result = [0] * (r*c)
        d = 1 # up
        for p in range(len(result)):
            #print(result)
            result[p] = mat[i][j]
            if d == 1:
                if i == 0 and j != c - 1:
                    d = 0
                    j += 1
                elif j == c - 1:
                    i += 1
                    d = 0
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != r - 1:
                    d = 1
                    i += 1
                elif i == r - 1:
                    j += 1
                    d = 1
                else:
                    i += 1
                    j -= 1
        return result