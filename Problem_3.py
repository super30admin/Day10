"""
## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
"""
#TC: O(m*n)
#SC: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        m = len(matrix)
        n = len(matrix[0])
        
        r= c = 0
        
        top, bottom = 0, m - 1
        left, right = 0, n - 1
        
        while(top <= bottom and left <= right):
            #top row
            for i in range(left, right+1):
                res.append(matrix[top][i])
                
            top += 1
            
            #right col
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
                
            right -= 1
            
            # Bottom row
            if (top <= bottom):
                for i in range(right, left - 1, -1):
                    res.append(matrix[bottom][i])

                bottom -= 1
            
            # Left col
            if (left <= right):
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])

                left += 1
            
        return res
        
        