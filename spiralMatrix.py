# // Time Complexity :O(m*n) for matrix traversal
# // Space Complexity :O(m*n) for resultant array
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english
#  We initialize 4 pointers for the matrix. First we move the left pointer to right. Then top goes to bottom. right goes to left(check again). bottom goes up (check).
#  As soon as one condition goes out of bounds while loop fails and we get our final result array for matrix spiral.
# can also be done with recursion with extra stack space.

# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        m = len(matrix)
        n = len(matrix[0])
        top, left, bottom, right = 0,0,m-1,n-1
        result = []

        while top <= bottom and left <= right:                  # while target in boundary condition
            for i in range(left,right+1):                       #  l -> [1, 2, 3, 4] <-r
                result.append(matrix[top][i])
            top +=1

            for i in range(top,bottom+1):                       # top -> bot
                result.append(matrix[i][right])
            right -=1

            if top <= bottom:    # and left <= right            # since top was affected earlier we check again
                for i in range(right,left-1,-1):                # r -> l
                    result.append(matrix[bottom][i])
                bottom -=1
                
            if left <= right:    # and top <= bottom            # since left was affected earlier we check again
                for i in range(bottom,top-1,-1):                # bot -> top
                    result.append(matrix[i][left])
                left +=1

        return result
    
print(Solution().spiralOrder([[1, 2, 3, 4],
                              [5, 6, 7, 8],
                              [9,10,11,12]]))