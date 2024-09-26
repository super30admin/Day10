class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:
        """
    Every element belongs to some diagonal, and it's previous element (if it exists) is it's top-left neighbor. We will check from 0th row and col and last -1 row and col and check the cells to their bottom right- row+1 and col+1
    TC- O(N)
    SC- O(1)
        """
        for i in range(len(matrix) - 1):
            for j in range(len(matrix[0]) - 1):
                if matrix[i][j] != matrix[i + 1][j + 1]:
                    return False
        return True

