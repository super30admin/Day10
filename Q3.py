######### Spiral Order of Matrix #######

# Time Complexity : O(n*m) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Challenges faced while coding this problem : No

# Keep adding the elements in the spiral order and adjusting the left, right,top and bottom bounds.


def spiral_matrix(matrix):
        if not matrix:
            return []
            
        m = len(matrix)
        n = len(matrix[0])
        top = 0 
        bottom = m - 1
        left = 0
        right = n-1
        result = []
        while top <= bottom and left <= right:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            
            for j in range(top,bottom+1):
                result.append(matrix[j][right])
            right-=1
                
            if top <= bottom:
                for k in range(right,left-1,-1):
                    result.append(matrix[bottom][k])
                bottom-=1
                
            if left <= right:
                for l in range(bottom,top-1,-1):
                    result.append(matrix[l][left])
                left+=1
        return result
