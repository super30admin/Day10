# // Time Complexity : O(n * m) 
# // Space Complexity : O(n*m) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : faced issue in which pointer to increment and which pointer to decrement. 

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top=0
        left=0
        right=len(matrix[0])-1
        bottom=len(matrix)-1
        ans=[]
        while top<=bottom and left <=right:
            for i in range(left,right+1):
                ans.append(matrix[top][i])
            top=top+1
            for i in range(top,bottom+1):
                ans.append(matrix[i][right])
            right=right-1
            if (top <= bottom):
                for i in range(right,left-1,-1):
                    ans.append(matrix[bottom][i])
                bottom=bottom-1
            if (left <= right):
                for i in range(bottom,top-1,-1):
                    ans.append(matrix[i][left])
                left=left+1
        return ans
    

# Approach:
# took 4 pointers to iterate in spiral manner then looped over the valid range and appended in the answer
