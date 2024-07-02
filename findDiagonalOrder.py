#time = O(m⋅n)
#space =  O(1)

def findDiagonalOrder(matrix):
    if not matrix or not matrix[0]:
        return []
    
    M, N = len(matrix), len(matrix[0])
    result = []
    r, c = 0, 0
    direction = 1  # 1 means moving up, -1 means moving down
    i = 0
    
    while i < M * N:
        result.append(matrix[r][c])
        i += 1
        if direction == 1:  # Moving up
            if c == N - 1:  # Hit the right border
                r += 1
                direction = -1
            elif r == 0:  # Hit the top border
                c += 1
                direction = -1
            else:  # Move up
                r -= 1
                c += 1
        else:  # Moving down
            if r == M - 1:  # Hit the bottom border
                c += 1
                direction = 1
            elif c == 0:  # Hit the left border
                r += 1
                direction = 1
            else:  # Move down
                r += 1
                c -= 1

    return result




    
# Test the function with the given input
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print(findDiagonalOrder(matrix))  # Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]