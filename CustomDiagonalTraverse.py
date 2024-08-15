# // Time Complexity : O(m*n) we are visiting each element in the matrix through each column and row
# // Space Complexity : O(1) no additional space
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#Maintain the direction of the flow so we can turn the direction at the corners from downwards to upwards and vice-versa.

from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        downward = False
        lstres = []
        row=0
        col=0
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if downward:
                    if col == 0 and row != len(mat) - 1:
                        lstres.append(mat[row][col])
                        row = row + 1
                        downward = False                        
                    elif row == len(mat) - 1:
                        lstres.append(mat[row][col])
                        col = col +1
                        downward = False                        
                    else:
                        lstres.append(mat[row][col])
                        row = row + 1
                        col -= 1                        

                else:
                    if row == 0 and col != len(mat[row]) - 1:
                        lstres.append(mat[row][col])
                        col = col +1
                        downward = True                        
                    elif col == len(mat[row]) - 1:                        
                        lstres.append(mat[row][col])
                        row = row + 1
                        downward = True                        
                    else:
                        lstres.append(mat[row][col])
                        col = col +1
                        row -= 1                        
        print(lstres)

            

obj = Solution()
#obj.findDiagonalOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
obj.findDiagonalOrder([[1,2],[3,4]])
