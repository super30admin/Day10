# Diagonal traverse of matrix

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """

        #logic to go up

        m = len(mat)    #Rows
        n = len(mat[0]) #Columns
        dir = True      #Boolean flag to track direction
        result=[]*(m*n) #Array of size m*n
        row = column = 0

        for i in range(m*n):
            result.append(mat[row][column])
            #logic to go up
            if dir:
                if column == n-1:
                    row+=1
                    dir=False
                elif row == 0:
                    column+=1
                    dir=False
                else:
                    row-=1
                    column+=1
            #logic to go down
            else: 
                if row == m-1:
                    column+=1
                    dir=True
                elif column == 0:
                    row+=1
                    dir=True
                else:
                    row+=1
                    column-=1
        return result


        
obj = Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
result = obj.findDiagonalOrder(mat)
print(result)