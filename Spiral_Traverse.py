# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# intialise 4 pointers , in directions 
# traverse each side and update boundaries 
# store matrix value while traversing in result array 

# // Your code here along with comments explaining your approach


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        m = len(matrix)
        n = len(matrix[0])
        top = 0 
        bottom = m - 1
        right = n -1 
        left = 0
        while (left <= right and top<= bottom):
            # left to right 
            for j in range(left,right + 1):
                result.append(matrix[top][j])
            top += 1
            # top to bottom 
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left-1 ,-1) :
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            if left <= right:
                for i in range(bottom , top-1 , -1) :
                    result.append(matrix[i][left])
                left += 1
        return result
