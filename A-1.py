# Array-1

## Problem 1: Product Except Itself (https://leetcode.com/problems/product-of-array-except-self/)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return []
        n = len(nums)
        rp = 1
        result = [0 for i in range(n)]
        result[0] = 1
        for i in range(1,n):
            rp = rp * nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp
        return result
# TC = O(n) , SC= O(1)

## Problem 2: Diagonal iteration	(https://leetcode.com/problems/diagonal-traverse/)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        index = 0
        row = 0
        col = 0
        Dir = 1
        while index < m*n:
            result[index] = mat[row][col]
            index = index +1
            if Dir ==1:
                if col == n-1:
                    Dir = -1
                    row  = row +1
                elif row == 0:
                    Dir = -1
                    col = col + 1
                else:
                    row = row - 1 
                    col = col + 1
            elif Dir == -1:
                if row == m-1:
                    Dir = 1
                    col  = col +1
                elif col == 0:
                    Dir = 1
                    row = row + 1
                else:
                    row = row + 1 
                    col = col - 1
        return result

# TC = O(n) , SC= O(1)
        
## Problem 3: Spiral Matrix (https://leetcode.com/problems/spiral-matrix/)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        while top <= bottom and left <= right:
            #move from left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top = top + 1
            #move from top to bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right = right - 1
            #move from right to left
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1
                #move from bottom to top
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left = left + 1
        return result
# TC = O(m*n) , SC = O(1)

