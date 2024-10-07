# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

class Spiral:
    def spiralOrder(self, matrix):
        rows = len(matrix)
        cols = len(matrix[0])
        total_elements = rows * cols
        e = 0
        result = []
        r,c = 0,0
        while e < total_elements:
            if r % 2 == 0: # left start
                c = 0
                while c < cols:
                    result.append(matrix[r][c])
                    #print(matrix[r][c])
                    e += 1
                    c += 1
                r += 1
            else:
                c = cols - 1
                while c >= 0:
                    result.append(matrix[r][c])
                    #print(matrix[r][c])
                    c -= 1
                    e += 1
                r += 1
            
        return result
        
inputArr = [[1,2,3],[4,5,6],[7,8,9]]
s = Spiral()
print(s.spiralOrder(inputArr))
    