"""
Leetcode-
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
:return
Tc:- O(m*n)
SC: O(m*n)
Ran on leetcode- yes
"""

class Solution:
    def findDiagonalOrder(self, mat):
        if mat==None :
            return []
        rows=len(mat)
        columns=len(mat[0])
        i,j=0,0
        resultArray=[0]*(rows*columns)
        indexResultArray=0
        direction=1 ##up
        while indexResultArray<rows*columns:
            resultArray[indexResultArray]=mat[i][j]
            indexResultArray+=1
            ###now we gotta find next i and j in the matrix
            if direction==1:
                if j==columns-1:
                    i+=1
                    direction=-1

                elif i==0:
                    j+=1
                    direction=-1

                else:
                    i-=1
                    j+=1

            else:
                if i==rows-1:
                    j+=1
                    direction = 1
                elif j==0:
                    i+=1
                    direction=1
                else:
                    j-=1
                    i+=1



mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
solve=Solution()
print(solve.findDiagonalOrder(mat))