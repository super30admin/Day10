# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# run while loop till top, bottom or left , right doesn't cross each other.
# check for conditions again at every point as we are updating them after every loop
# run for loop over each row and column individually to imitate spiral pattern
def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
    m = len(matrix)
    n = len(matrix[0])
    top = 0
    bottom = m-1
    left = 0
    right = n-1
    result = []
    
    while(top<=bottom and left<=right):
        if top<=bottom:
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top +=1
        if left<=right:
            for j in range(top,bottom+1):
                result.append(matrix[j][right])
            right -=1
        if top<=bottom:
            for k in range(right, left-1,-1):
                result.append(matrix[bottom][k])
            bottom -=1
        if left<=right:
            for l in range(bottom, top-1,-1):
                result.append(matrix[l][left])
            left +=1
    return result




# recursive solution


class Solution:
    result = []
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        self.result = []
        if m == 0: 
            return self.result
        self.helper(top,bottom, left ,right,matrix)
        return self.result
        # run while loop till top, bottom or left , right doesn't cross each other.
        # check for conditions again at every point as we are updating them after every loop
        # run for loop over each row and column individually to imitate spiral pattern
    def helper(self,top,bottom, left ,right, matrix):

        if top>bottom and left> right:
            return
        if top<=bottom:
            for i in range(left, right+1):
                self.result.append(matrix[top][i])
            top +=1
        if left<= right:
            for j in range(top,bottom+1):
                self.result.append(matrix[j][right])
            right -=1
        if top<=bottom:
            for k in range(right, left-1,-1):
                self.result.append(matrix[bottom][k])
            bottom -=1
        if left<= right:
            for l in range(bottom, top-1,-1):
                self.result.append(matrix[l][left])
            left +=1
        print(top)
        self.helper(top,bottom, left ,right, matrix)
        
    




        