#54. Spiral Matrix
#Without recursion
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        top = 0 
        right = n-1
        bottom = m-1
        left = 0
        output = []

        while left <= right and top <= bottom:
            for i in range(left, right+1):
                output.append(matrix[top][i])
            top += 1

            if left <= right:
                for i in range(top, bottom+1):
                    output.append(matrix[i][right])
                right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    output.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    output.append(matrix[i][left])
                left += 1

        return output
    
#Using Recursion
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        output = []

        
        def helper(top,bottom,left,right,output,matrix):
            if top > bottom or left > right:
                return

            for i in range(left, right+1):
                output.append(matrix[top][i])
            top += 1

            if left <= right:
                for i in range(top, bottom+1):
                    output.append(matrix[i][right])
                right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    output.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    output.append(matrix[i][left])
                left += 1

            helper(top,bottom,left,right,output,matrix)

        helper(0,m-1,0,n-1,output,matrix)
        return output










        










        