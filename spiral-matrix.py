"""

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Time Complexity : O(Mn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# The approach follows a layer-by-layer traversal of the matrix in a spiral order.  
# We define boundaries (left, right, top, bottom) and iterate through the matrix,  
# moving right, down, left, and up while adjusting the boundaries accordingly.  


class Solution:  
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:  

        res = []  
        left, right = 0, len(matrix[0])  
        top, bottom = 0, len(matrix)  

        while left < right and top < bottom:  

            for i in range(left, right):  
                res.append(matrix[top][i])  
            top += 1  

            for i in range(top, bottom):  
                res.append(matrix[i][right-1])  
            right -= 1  

            if not(left < right and top < bottom):  
                break  

            for i in range(right-1, left-1, -1):  
                res.append(matrix[bottom-1][i])  
            bottom -= 1  

            for i in range(bottom-1, top-1, -1):  
                res.append(matrix[i][left])  
            left += 1  

        return res  
