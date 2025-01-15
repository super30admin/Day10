# Product of Array Except Itself_Solution_Q1

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums== None or len(nums) ==0:
            return[]

        n= len(nums)
        rp= 1
        result= [0 for i in range (n)]
        result[0] =1

        for i in range(1,n):
            rp= rp * nums[i-1]
            result[i] = rp

        rp =1
        for i in range(n-2, -1, -1):
            rp= rp* nums[i+1]
            result[i]= rp * result[i]
        return result

# TC: O(n)
# SC: O(1)

------------------------------------------------------------------------------------------------------------------------------------------

# Diagonal Traverse_Solution_Q2

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0:
            return []

        m, n = len(mat), len(mat[0])  # Number of rows and columns
        result = []
        direction = 1  # 1 for up, -1 for down

        r, c = 0, 0
        while len(result) < m * n:
            result.append(mat[r][c])

            # Moving upwards
            if direction == 1:
                if c == n - 1:  # If we are at the last column
                    r += 1
                    direction = -1
                elif r == 0:  # If we are at the first row
                    c += 1
                    direction = -1
                else:  # Move diagonally up
                    r -= 1
                    c += 1

            # Moving downwards
            else:
                if r == m - 1:  # If we are at the last row
                    c += 1
                    direction = 1
                elif c == 0:  # If we are at the first column
                    r += 1
                    direction = 1
                else:  # Move diagonally down
                    r += 1
                    c -= 1

        return result

# TC: O(mn)
# SC: O(1)

------------------------------------------------------------------------------------------------------------------------------------------
# Spiral Matrix_Solution_Q3


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m= len(matrix)
        n= len(matrix[0])

        result = []
        top = 0
        bottom= m-1
        left = 0
        right= n-1

        while top <= bottom and left <=right:
            #top row
            for i in range(left, right +1):
                result.append(matrix[top][i])
            top= top +1

            #right column
            for i in range(top, bottom +1):
                result.append(matrix[i][right])
            right = right -1

            #botton row
            if top <= bottom:
                for i in range(right, left -1,-1):
                    result.append(matrix[bottom][i])
                bottom= bottom -1

            #left col
            if left <=right:
                for i in range(bottom, top -1, -1):
                    result.append(matrix[i][left])
                left = left +1
        return result
    
# TC: O(mn)
# SC: O(1)
