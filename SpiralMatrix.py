#Time complexity: O(m*n)
#Space complexity: O(m*n)
#Leetcode: Yes (Java: 2ms)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        top = 0
        bottom = m-1
        left = 0
        right = n-1

        result = []

        while top<= bottom and left<=right:
            if top<= bottom and left<=right:
                #left to right
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                top+=1
            if top<= bottom and left<=right:
                #top to bottom
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right-=1
            if top<= bottom and left<=right:
                #right to left
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            if top<= bottom and left<=right:
                #bottom to top
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result