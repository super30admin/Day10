# Time Complexity : O(m * n), where n is the number of elements in given matrix
# Space Complexity : O(1), because we are expectd to return the result array 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# we are using 4 variables to iterate the given matrix in spiral order
# first we go from left to right in top row
# now since the element on top right si already covered, and next we have to move from top to bottom in right, we change top to top++
# then after covering top to bottom in right, we do right-- because all elements in right are now covered
# from right to left in bottom row
# then decrease bottom, and from bottom to top in left
# then increase left and let the loop run until the conditions are met
# need to make sure boundaries are handled so that there is no repititions

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix) # no of rows
        n = len(matrix[0]) # no of columns
        top = 0
        bottom = m -1 # last row
        left = 0
        right = n -1 # last column

        # initializing the output matrix
        result = []
        while(left <= right and top <= bottom):
            # from left to right in top
            if left <= right:
                for i in range(left, right + 1):
                    result.append(matrix[top][i])
                
            top += 1
            
            # from top top to bottom in right
            for i in range(top, bottom + 1, 1):
                result.append(matrix[i][right])
            
            right -= 1

            # from top right to left in bottom
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
            
            bottom -= 1
            
            # from bottom to top in left
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
           
            left += 1

        return result
            

                



        