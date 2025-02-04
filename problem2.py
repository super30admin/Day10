class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        idx = 0
        result = []
        if not mat:
            return result
        row, col = 0, 0
        direction = True
        while row < m and col < n:
            result.append(mat[row][col]) 
            #find new location of row and col
            #upward direction
            if direction:
                if col == n-1:
                    #right
                    row +=1
                    direction = False
                elif row == 0:
                    #roof
                    col += 1
                    direction = False
                else:
                    row -=1
                    col +=1
            else:
                #down
                if row == m-1:
                    #left
                    col +=1
                    direction = True
                elif col == 0:
                    #bottom
                    row += 1
                    direction = True
                else:
                    col -=1
                    row +=1
        return result