class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # TC: O(m*n)
        # SC: O(1)
        if matrix is None or len(matrix) == 0:
            return []
        m,n = len(matrix),len(matrix[0])
        res = []
        top,bottom = 0,m-1
        left,right = 0,n-1
        while top <= bottom and left <= right:
            # go from left to right
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
            # go from top to bottom
            for j in range(top,bottom+1):
                res.append(matrix[j][right])
            right -= 1
            # from right to left
            if top <= bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            # from bottom to top
            if left <= right:
                for j in range(bottom,top-1,-1):
                    res.append(matrix[j][left])
                left += 1
        return res


        