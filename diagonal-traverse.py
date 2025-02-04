# The solution traverses the matrix diagonally by iterating through all diagonals, collecting elements in an intermediate list, 
# and appending them to the result. For even diagonals, the elements are reversed before adding them to maintain the desired order.      
# Time Complexity: O(N⋅M)
# Space Complexity: O(min(N,M))
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result =[]
        n = len(matrix)
        m = len(matrix[0])
        result, intermediate = [], []
        for d in range(n+m-1):
            intermediate.clear()
            r, c = 0 if d < m else d - m+1, d if d<m else m-1
            while r<n and c >-1:
                intermediate.append(matrix[r][c])
                r += 1
                c -= 1
            if d% 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        return result