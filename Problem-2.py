inputArr = [[1,2,3],[4,5,6],[7,8,9]]

class Printer:
    def showArr(self, matrix):
        d = 0
        M,N = len(matrix), len(matrix[0])
        result = []
        for d in range(M + N - 1):  # d represents the diagonal number
            if d % 2 == 0:  # even diagonal
                # Start from bottom-left
                r = min(d, M - 1)  # row
                c = d - r         # column
                while r >= 0 and c < N:
                    result.append(matrix[r][c])
                    r -= 1
                    c += 1
            else:  # odd diagonal
                # Start from top-right
                c = min(d, N - 1)  # column
                r = d - c          # row
                while c >= 0 and r < M:
                    result.append(matrix[r][c])
                    r += 1
                    c -= 1
        
        return result

p = Printer()
print(p.showArr(inputArr))
    