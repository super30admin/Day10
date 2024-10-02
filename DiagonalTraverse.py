#Time Complexity : O(m*n)
#Space Complexity : O(m*n)
#Did this code successfully run on Leetcode : Yes

#Three line explanation of solution in plain english
#-->Upward Direction : Check if it's the last column or Check if it's the first row
#-->Downward Direction : Check if it's the first column or check if it's the last row

#Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        #Initialise m(row) and n(column)
        m = len(mat)
        n = len(mat[0])
        #Assign result matrix
        result = [1 for i in range(0,m*n)]
        #Initialise r,c and upDir
        r=0
        c=0
        #To change the direction of traversal
        upDir = True
        for i in range(0,m*n):
            #Initially append the element in 0th row and 0th column in result as we start iterating from there itself
            result[i]=mat[r][c]
            #Upwards
            if(upDir):
                #Edge case 1: First check if it is the last column
                if(c==n-1):
                    r+=1
                    upDir=False
                #Edge case 2: If not then check if it is the first row
                elif(r==0):
                    c+=1
                    upDir=False
                #If not regularlly traverse upwards
                else:
                    r-=1
                    c+=1
            #Downwards
            else:
                #Edge Case 1:First check if it is the last row
                if(r==m-1):
                    c+=1
                    upDir=True
                #Edge Case 2: If not check if it's first column
                elif(c==0):
                    r+=1
                    upDir=True
                ##If not regularlly traverse downwards
                else:
                    r+=1
                    c-=1
        return result
        
        