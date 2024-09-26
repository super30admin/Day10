"""
https://leetcode.com/problems/spiral-matrix/
An input matrix of size M*N is given return all elements of the matrix in spiral order.
Tc: m *n
Sc: m*n
"""


class Solution:
    def spiralOrder(self, matrix):
        m=len(matrix)
        n=len(matrix[0])
        resultArray=[]
        # resultArray[0]=matrix[0][0]
        top=0
        bottom = m-1
        left=0
        right= n-1
        while left <=right and top<=bottom:
            ###iterate top row from left to right
            for j in range(left, right+1):
                resultArray.append(matrix[top][j])
            top+=1

            ###iterating right column from top to bottom
            for i in range(top, bottom+1):
                resultArray.append(matrix[i][right])
            right-=1

            if top <= bottom:
                for j in range(right, left-1, -1):
                    resultArray.append(matrix[bottom][j])
                bottom -= 1

            if left<= right:
                for i in range(bottom, top-1, -1):
                    resultArray.append(matrix[i][left])
                left+=1

        return resultArray

        # return matrix

matrix = [[1,2,3],[4,5,6],[7,8,9]]
solve=Solution()
print(solve.spiralOrder(matrix))




"""

[
 [ 1, 2, 3 ],
 [ 5, 99, 6 ],
 [ 7, 8, 90 ]
]

Output:[1,2,5,7,99,3,6,8,90]

"""


