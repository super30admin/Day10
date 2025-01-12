# Time Complexity : O(m * n), where n is the number of elements in nums
# Space Complexity : O(m * n), where n is the number of elements in nums
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# we are using a new array to store the flattened result
# for diagonal traversal, we notice there are 2 directions - bottom to top (+1) and top to bottom (-1)
# now, for both directios we traverse by giving the indices of the next element
# for edge cases, where row = 0 and column = n - 1, we have to be careful about sequence of conditions
# similarly, for other direction, we check edge cases when col = 0 and row = m - 1

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat:
            return []
        
        m = len(mat)
        n = len(mat[0])
        # creating an array to return the result of diagonal rows in a flattened array
        result = [0] * (m * n)
        index = 0
        row = 0
        col = 0
        dirs = 1
        # 1 means going from bottom to top
        # -1 mwans going from top to bottom
        while index < m * n:
            # here we find the current element
            result[index] = mat[row][col]
            index += 1
            # for next element we have to check for the direction
            if dirs == 1:
                # we need to write this condition first because, at 3, row is 0 and col is n-1
                # we would have checked row first, then at the last column, it will try to do col++
                # and that would give an error
                if col == n - 1:
                    # direction change and next element is in the same column, next row
                    row += 1
                    dirs = -1
                
                elif row == 0:
                    # next element is in the same row, next column
                    col += 1
                    # direction change
                    dirs = -1

                else:
                    # normally the next element in this direction
                    row -= 1
                    col += 1
            
            # from top to bottom
            elif dirs == -1:
                # last row
                if row == m - 1:
                    col += 1
                    dirs = 1
                # first column
                elif col == 0:
                    row += 1
                    dirs = 1
                # normally next element for this direction
                else:
                    row += 1
                    col -= 1

        return result


        