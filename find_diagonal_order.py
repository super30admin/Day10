def find_diagonal_order(matrix):
    if not matrix or not matrix[0]:
        return []
    
    M, N = len(matrix), len(matrix[0])
    result = []
    diagonals = {}
    
    for i in range(M):
        for j in range(N):
            if i + j not in diagonals:
                diagonals[i + j] = []
            diagonals[i + j].append(matrix[i][j])
    
    for k in range(M + N - 1):
        if k % 2 == 0:
            # Even sum diagonals are traversed from bottom to top
            result.extend(diagonals[k][::-1])
        else:
            # Odd sum diagonals are traversed from top to bottom
            result.extend(diagonals[k])
    
    return result

#time O(n)
#space  O(n)
