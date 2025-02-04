# https://leetcode.com/problems/diagonal-traverse/description/

# Time Complexity : O(mn)
# Space Complexity : O(mn)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        m = len(mat) #rows
        n = len(mat[0]) # columns
        result = [None] * (m*n)
        idx = 0
        direction = True # Up
        i = 0 
        j = 0
        
        while(idx < m*n):
            result[idx] = mat[i][j]
            idx+=1

            if direction: #up
                if i == 0 and j!= n-1: #top row and not right top corner
                    j+=1 # go to next col and change dir
                    direction = False
            
                elif j == n - 1: # last col
                    i+=1 #go to next row and change dir
                    direction = False
            
                else: # not the edges and corners
                    i-=1
                    j+=1

            else: #down 
                if i == (m-1): # bottom row
                    j+=1 # go to next col
                    direction = True
            
                elif j == 0 and i!= (m-1): #first col and not left bottom corner
                    i+=1 # go upper row
                    direction = True
            
                else: # not edges or corners
                    i+=1
                    j-=1
        return result

        