# Time Complexity :

# O(m*n) 


# Space Complexity :  

# O(1) , Since answer is expected in form of array, array size for "result" doen't count towards increasing space complexity 


# Approach:
# Set Dir =1 for bottom-to-top travsersal and dir = -1 for top-to-bottom. 
# Then put conditions to switch directions and put the elements to result array



class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat or len(mat) == 0:
            return []
         
        rows = len(mat)    # no. of rows
        cols = len(mat[0])  # no. of cols

        result = [0]*(rows*cols)  # result array to store elements
        index = 0             # index to iterate in result array
        row, col = 0, 0     # starting from this element of "mat"

        dir = 1   # indicates bottom-to-up direction

        while( index < len(result)):
            result[index] = mat[row][col]
            index += 1

            if dir == 1:
                if col == cols-1:
                    dir = -1
                    row = row + 1
                elif row == 0:
                    dir = -1
                    col = col + 1
                else:
                    row = row - 1
                    col = col + 1
            else:
                if row == rows-1:
                    dir = 1
                    col = col + 1
                elif col == 0:
                    dir = 1 
                    row = row + 1
                else:
                    row = row + 1
                    col = col - 1

        return result