'''
// Time Complexity :
# Problem 1: O(n) as we parse through the entire array
# Problem 2: O(m*n) m = no. of rows & n = no. of columns
# Problem 3: O(m*n) m = no. of rows & n = no. of columns
// Space Complexity :
# Problem 1: O(1) as we store the result in a separate array - auxillary space
# Problem 2: O(m*n) => O(1) auxillary space
# Problem 3: O(1) as we initialize a new array
// Did this code successfully run on Leetcode :
Yes the code successfully ran.
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
'''
## Problem 1 - Product of array
# At any given element we need the product of elements to the left of the element and right of the 
# element.
# Create a result array by taking product of the left elements except the number itself.
# On this result array now we will take product of the right elements except the number itself.
# The resultant array will return us the products.
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if nums == 0 or len(nums) == 0: return nums
        n = len(nums)
        result_product = 0
        # initialize the first element as '1'
        result = [1]
        # take product of the array from left to right
        for i in range(1, n):
            result_product = nums[i-1]*result[i-1]
            result.append(result_product)
        # take product of the array from right to left
        result_product = 1
        for i in range(n-1, -1, -1 ):
            result_product *= nums[i]
            result[i] = result[i]*result_product
        return result
    
## Problem 2: Traverse matrix in diagonal order
# Get the number of rows and columns and initialize a result array of size product of rows & columns
# to store the result.
# Initialize an index as '0' and start parsing the matrix by appending the first element
# First we go in the upward direction, by incrementing the row index and change the direction to False
# until we reach the roof condition of the matrix
# Second we go down once the roof is reached and collect all the column index elements and change 
# direction to True until we hit the bottom row of the matrix. The condition 'True' indicates to go UP. 
# Return the result array.
class Solution(object):
    def spiralOrder(self, mat):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        if mat == None: return result
        dir = True
        idx = 0
        i = 0
        j = 0
        while(idx < (m*n)):
            result[idx] = mat[i][j]
            idx += 1
            # new location of i and j
            if dir == True:
            # UP direction    
                if j == n-1:
                    i += 1
                    dir = False 
                elif i == 0: 
                    j += 1
                    dir = False
                else:
                    i -= 1
                    j += 1
            else:
            # DOWN direction    
                if i == m-1:
                    j += 1
                    dir = True 
                elif j == 0: 
                    i += 1
                    dir = True
                else:
                    j -= 1
                    i += 1    
        return result         

## Problem 3 - Spiral Matrix
# Initialize an array of size that is rows times columns
# First we move from left to right on the top row, by parsing on each column and same row, collect 
# all elements
# Move from top to bottom by parsing each row and same column, collect all elements
# Move from right to left but check the condition top <= bottom so that we don't collect
# duplicates, collect all elements
# Move from bottom to top but check the condition that left <= right to make sure we don't collect
# duplicates. Parse each row element and same column, collect all elements.
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix)
        n = len(matrix[0])
        if matrix == None or len(matrix) == 0: return []
        i = 0
        j = 0
        result = [0 for i in range(m*n)]
        top = 0 
        bottom = m-1
        left = 0
        right = n-1
        count = 0
        while(top <= bottom and left <= right):
            # TOP
            for j in range(left, right + 1):
                result[count] = matrix[top][j]
                count += 1
            top += 1
            # RIGHT
            for i in range(top, bottom + 1):
                result[count] = matrix[i][right]
                count += 1
            right -= 1
            # BOTTOM
            if top <= bottom:
                for j in range(right, left-1, -1):
                    result[count] = matrix[bottom][j]
                    count += 1                    
                bottom -= 1
            # LEFT
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result[count] = matrix[i][left]
                    count += 1
                left += 1
        return result                   
