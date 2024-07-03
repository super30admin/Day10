"""
## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]
"""
#TC: O(m*n)
#SC: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        res = []
        r = 0
        c = 0
        direction_flag = True
        
        while(len(res) < m*n):
            res.append(mat[r][c])
        
            
            if(direction_flag):
                if (c==n-1):
                    r += 1
                    direction_flag = False

                elif(r==0):
                    c += 1
                    direction_flag = False

                else:
                    r -= 1
                    c += 1
                
            else:
                if (r == m-1):
                    c += 1
                    direction_flag = True
                    
                elif (c == 0):
                    r += 1
                    direction_flag = True
                    
                else:
                    r += 1
                    c -= 1
                    
        return res
                
                
        