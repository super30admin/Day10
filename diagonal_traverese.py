class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row_length = len(mat)
        col_length = len(mat[0])
        result = [0] * (row_length * col_length)
        flag = True
        row = 0
        col = 0

        for i in range(len(result)):
            result[i] = mat[row][col]

            if flag:
                if col == col_length - 1:
                    row += 1
                    flag = False
                elif row == 0:
                    col += 1
                    flag = False
                else:
                    row -= 1
                    col += 1
            else:
                if row == row_length - 1:
                    col += 1
                    flag = True
                elif col == 0:
                    row += 1
                    flag = True
                else:
                    row += 1
                    col -= 1

        return result


