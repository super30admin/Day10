# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top, bottom, left, right = 0, m-1, 0, n-1
        result = []
        if not matrix:
            return result
        while(top <=bottom and left <= right):
            for col in range(left, right+1):
                result.append(matrix[top][col])
            top += 1

            for row in range(top, bottom+1):
                result.append(matrix[row][right])
            right -= 1

            if top<=bottom:
                for col in range(right, left - 1, -1):
                    result.append(matrix[bottom][col])
                bottom-=1
            
            if left<=right:
                for row in range(bottom, top -1, -1):
                    result.append(matrix[row][left])
                left+=1
            
        return result