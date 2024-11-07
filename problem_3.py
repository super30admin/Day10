# TC: O(m*n)
# SC: O(1)

def spiralOrder(matrix):
        m, n = len(matrix), len(matrix[0])
        top, bottom, right, left = 0, m - 1, n - 1, 0
        ans = []
        while (top <= bottom and left <= right):
            for i in range(left, right + 1):
                ans.append(matrix[top][i])
            top += 1

            for i in range(top, bottom + 1):
                ans.append(matrix[i][right])
            right -= 1
                
            if (top <= bottom and left <= right):
                for i in range(right, left - 1  , -1):
                    ans.append(matrix[bottom][i])
                bottom -= 1

            if (top <= bottom and left <= right):
                for i in range(bottom, top - 1, -1):
                    ans.append(matrix[i][left])
                left += 1
        return ans

input = [[1,2,3],[4,5,6],[7,8,9]]
print(spiralOrder(input))