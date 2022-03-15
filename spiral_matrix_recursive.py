# Time Complexity : O(m*n)
# Space Complexity : O(m) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

#Recurse on the inner spiral matrices 
#Maintain the result and boundary parameters in the recursive stack

# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if matrix is None:
            return result
        
        m = len(matrix)
        n = len(matrix[0])
        result = [0]*(m*n)
        left,right,top,bottom = 0,n-1,0,m-1
        
        self.recurse(matrix,left,right,top,bottom,result,0)
        
        return result
        
    def recurse(self,matrix,left,right,top,bottom,result,idx):
        
        # base condition
        
        if left>right and top>bottom:
            return
        if top<=bottom:
            for j in range(left,right+1):
                result[idx] = matrix[top][j]
                idx +=1
        
            top +=1
        if left<=right:
            for i in range(top,bottom+1):
                result[idx] = matrix[i][right]
                idx +=1
            
            right -=1
        
        if top<=bottom:
            for j in range(right,left-1,-1):
                result[idx] = matrix[bottom][j]
                idx +=1
            
            bottom -=1
        
        if left<=right:
            for i in range(bottom,top-1,-1):
                result[idx] = matrix[i][left]
                idx +=1
        
            left +=1
        self.recurse(matrix,left,right,top,bottom,result,idx)
        
        
            
        
        