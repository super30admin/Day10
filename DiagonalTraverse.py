# Time Complexity: O(m*n)
# Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat):
        if not mat or len(mat) == 0:
            return []
        
        dir = 1  # Direction starts with Bottom to Top approach
        m = len(mat)  # Number of rows
        n = len(mat[0])  # Number of columns
        result = [0] * (m * n)
        index = 0
        row, col = 0, 0
        
        while index < len(result):
            result[index] = mat[row][col]
            index += 1
            
            if dir == 1:
                if col == n - 1:
                    dir = -1
                    row += 1
                elif row == 0:
                    dir = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        
        return result

# Example 1
solution = Solution()
mat = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print(solution.findDiagonalOrder(mat))  # Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]

# Example 2
mat = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16]
]
print(solution.findDiagonalOrder(mat))  # Output: [1, 2, 5, 9, 6, 3, 4, 7, 10, 13, 14, 11, 8, 12, 15, 16]

# Example 3
mat = [
    [10, 20, 30, 40, 50],
    [60, 70, 80, 90, 100],
    [110, 120, 130, 140, 150],
    [160, 170, 180, 190, 200],
    [210, 220, 230, 240, 250]
]
print(solution.findDiagonalOrder(mat))  # Output: [10, 20, 60, 110, 70, 30, 40, 80, 120, 160, 210, 170, 130, 90, 50, 100, 140, 180, 220, 230, 190, 150, 200, 240, 250]