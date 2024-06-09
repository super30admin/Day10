# Time Complexity :

# O(m*n) 


# Space Complexity :  

# O(1) , Since answer is expected in form of array, array size for "result" doen't count towards increasing space complexity 


# Approach:
# Initialze 4 pointers, top and bottom (for accessing row elements), left and right (for column elements)




class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix or len(matrix) == 0:
            return []
        
        rows = len(matrix)
        cols = len(matrix[0])

        result = []

        top = 0
        bottom = rows-1
        left = 0
        right = cols-1

        while(top <= bottom and left <= right):
            # traverse right
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top+=1
            # traverse down
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right-=1

            # traverse left
            if top<=bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom-=1

            # traverse up
            if left<= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left+=1

        return result