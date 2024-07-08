// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
#Self Product
#Time Complexity : O(n)
#Space Complexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach : The algorithm is done by using two passes: first, accumulating left products, and second, combining them with right products.
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        answer = [1] * n
        for i in range(1, n):
            answer[i] = answer[i - 1] * nums[i - 1]
        right_product = 1
        for i in reversed(range(n)):
            answer[i] *= right_product
            right_product *= nums[i]
    
        return answer

// Your code here along with comments explaining your approach
#diagonal
#Time Complexity : O(m*n)
#Space Complexity:O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach : The algorithm traverses the matrix diagonally, first starting from each column of the first row and then from each row of the last column, collecting elements in the order specified by their diagonal index (even or odd).

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat or not mat[0]:
            return []
        m, n = len(mat), len(mat[0])
        result = []
        for start_col in range(n):
            i, j = 0, start_col
            diagonal = []
            while i < m and j >= 0:
                diagonal.append(mat[i][j])
                i += 1
                j -= 1

            if start_col % 2 == 0:
                result.extend(diagonal[::-1])
            else:
                result.extend(diagonal)

        for start_row in range(1, m):
            i, j = start_row, n - 1
            diagonal = []
            while i < m and j >= 0:
                diagonal.append(mat[i][j])
                i += 1
                j -= 1

            if (start_row + n - 1) % 2 == 0:
                result.extend(diagonal[::-1])
            else:
                result.extend(diagonal)

        return result

#Spiral Matrix
#Time Complexity : O(m*n)
#Space Complexity:O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach : Function visits each element of the matrix in a spiral pattern - starting from the top-left corner and moving right, down, left, and up again until all elements are visited.

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        m = len(matrix)
        n = len(matrix[0])
        top, bottom, left, right = 0, m - 1, 0, n - 1

        while top <= bottom and left <= right:
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1

            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result

        
        
