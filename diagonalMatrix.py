#O(N*M) time and O(min(N, M)) space, the space is used to store the diagonals
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        rows = len(mat)
        columns = len(mat[0])
        diagonals = [[] for i in range(rows + columns - 1)]
        
        for i in range(rows):
            for j in range(columns):
                diagonals[i + j].append(mat[i][j])
                
        result = diagonals[0]
        
        for i in range(1, len(diagonals)):
            if i% 2 == 0:
                result.extend(diagonals[i][::-1])
            else:
                result.extend(diagonals[i])
                     
        return result