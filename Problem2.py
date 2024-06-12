#Time Complexity: O(n)
#Space Complexity: O(n)
#Leetcode: Yes

class Solution:
    def isEven(self, sum_):
        if sum_%2 == 0:
            return True
        return False
 
    def findDiagonalOrder(self, mat):
        if len(mat) == 0 or len(mat[0]) == 0:
            return []

        row, col = len(mat), len(mat[0])
        x,y,i = 0,0,0
        output = [0]*(row*col)

        while(i<len(output)):
            output[i] = mat[x][y]
            i+=1
            sum_ = x+y
            if self.isEven(sum_):
                if y<col-1 and x>0:
                    y+=1
                    x-=1
                elif y<col-1:
                    y+=1
                else:
                    x+=1
            else:
                if x<row-1 and y>0:
                    x+=1
                    y-=1
                elif x<row-1:
                    x+=1
                else:
                    y+=1
            
            
        return output

obj = Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
print(obj.findDiagonalOrder(mat))