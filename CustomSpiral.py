# // Time Complexity : O(m*n) we are visiting each element in the matrix through each column and row
# // Space Complexity : O(1) no additional space
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#used 4 pointers to maintain the boundaries and updating the pointers as we navigate through rows and columns

from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])
        result = []
        top = 0
        bottom = row
        left = 0
        right = col

        while top < bottom and left < right:
            # Top
            if top < bottom and left < right:
                for i in range(left, right, 1):
                    result.append(matrix[top][i])
                top += 1

            # Right
            if top < bottom and left < right:
                for i in range(top, bottom, 1):
                    result.append(matrix[i][right - 1])
                right -= 1

            # Bottom
            if top < bottom and left < right:
                for i in range(right - 1, left - 1, -1):
                    result.append(matrix[bottom - 1][i])
                bottom -= 1

            # Left
            if top < bottom and left < right:
                for i in range(bottom -1, top -1, -1):
                    result.append(matrix[i][left])
                left += 1

        print(result)


obj = Solution()
#obj.spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
#obj.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
obj.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]])
