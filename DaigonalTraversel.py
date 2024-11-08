def findDiagonalOrder(mat):
    arr = []
    dir = True
    m = len(mat)
    n = len(mat[0])
    row = 0
    col = 0
    while(len(arr)<m*n):
        if row == 0 and col == 0:
            arr.append(mat[row][col])
            print(row,col)
            if col < n-1:
                col = col + 1
            else:
                row = row + 1
            dir = False
        if col >= 0 :
            if row < m and col > 0 and  dir == False:
                arr.append(mat[row][col])
                print(row,col)
                row = row + 1
                col = col - 1
            if col == 0 and row < m-1 and dir == False:
                arr.append(mat[row][col])
                print(row,col)
                row = row + 1
                dir = True
        if row == m-1 and col >=0 and dir == False:
            arr.append(mat[row][col])
            print(row,col)
            col = col + 1
            dir = True
        if row > 0 and col < n and dir == True:
            print(row,col)
            arr.append(mat[row][col])
            
            row = row - 1
            col = col + 1
        if row == 0 and col < n-1 and dir == True:
            arr.append(mat[row][col])
            print(row,col)
            col = col + 1
            dir = False
        if col == n-1 and row >= 0 and dir == True:
            arr.append(mat[row][col])
            print(row,col)
            row = row + 1
            dir = False
        if row == m-1 and col == n-1:
            print(row,col,"last")
            arr.append(mat[row][col])
            break
        
    return arr



mat = [[6,9,7]]

print(findDiagonalOrder(mat))
