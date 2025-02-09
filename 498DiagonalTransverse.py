def findDiagonalOrder(matrix):
    if not matrix or not matrix[0]:
        return[]
    
    # number of rows and columns in matrix
    M,N = len(matrix),len(matrix[0])

    # array to store diagonal order
    result = []

    # initial position
    # 1 - up right direction , -1 down left direction
    row,col,direction = 0,0,1 

    for _ in range(M*N):
        result.append([matrix[row][col]])

        # Direction Calculation 
        if direction == 1:
            if col == N-1: # hit the right boundry
                row +=1
                direction = -1 
            elif row == 0: # hit the top boundry
                col += 1
                direction = -1
            else:
                row -=1
                col +=1
        else: # -1 direction
            if row == M-1: # hit last row
                col += 1
                direction = 1
            elif col == 0: #hit first col 
                row += 1 
                direction = 1
            else:
                row += 1
                col -= 1
    return result