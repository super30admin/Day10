'''
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : same implementation as in class

// Your code here along with comments explaining your approach
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        top, bottom = 0, m -1
        left, right = 0, n - 1
        result = []

        while(top <= bottom and left <= right):
            
            # going right
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1

            # going down
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # going left
            for i in range(right, left - 1):
                result.append(matrix[i][bottom])
            bottom += 1

            # going up
            for j in range(bottom, top - 1):
                result.append(matrix[left][j])
            right -= 1

        return result