#Time: O(m*n)
#Space: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        d=1
        m= len(mat)
        n= len(mat[0])
        arr=list()
        row =0
        col =0

        for i in range(m*n):
            arr.append(mat[row][col])
            i = i +1
            if(d == 1):
                if( col == n-1):
                    d= -1
                    row = row+1
                elif( row == 0):
                    d=-1
                    col = col + 1
                else:
                    row = row -1
                    col = col + 1
                
            elif(d == -1):
                if( row == m -1):
                    d= 1
                    col = col +1
                elif( col == 0):
                    d= 1
                    row = row + 1
                else:
                    row = row +1
                    col = col - 1
        return arr
            
        
