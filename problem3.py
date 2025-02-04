# Time Complexity : O(n*m), n->rows m->cols
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        R,C = len(matrix), len(matrix[0])
        top, down, left, right = 0, R-1, 0, C-1
        i,j =0,0
        dir = 1
        res = []
        while left <= right and top <= down:
            if dir == 1: #left
                while j <= right:
                    res.append(matrix[i][j])
                    j += 1
                j -= 1
                i += 1
                top += 1
                dir = 2
            elif dir == 2: #down
                while i <= down:
                    res.append(matrix[i][j])
                    i += 1
                i -= 1
                j -= 1
                right -= 1
                dir = 3
            elif dir == 3: #left
                while j >= left:
                    res.append(matrix[i][j])
                    j -= 1
                j += 1
                i -= 1
                down -= 1
                dir = 4
            elif dir == 4: #up
                while i >= top:
                    res.append(matrix[i][j])
                    i -= 1
                i += 1
                j += 1
                left += 1
                dir = 1

        return res