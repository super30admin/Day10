# Time Complexity: O(MN), where N is length of matrix and N is columns
# Space Complexity: O(1)
# Executed Successfully: Yes
# Challenges faced: No


#CODE
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == [] or len(mat) == 0:
            return []
        if len(mat) == 1:
            return mat[0]
        arr = [None] * (len(mat)*len(mat[0]))
        row, col, ind, di = 0, 0, 0, 1
        while ind < len(arr):
            arr[ind] = mat[row][col]
            ind += 1
            if di == 1:
                if row == 0 and col != len(mat[0])-1:
                    di = -1
                    col += 1
                elif col == len(mat[0])-1:
                    di = -1
                    row += 1
                else:
                    row -= 1
                    col += 1
            else:
                if col == 0 and row != len(mat)-1:
                    di = 1
                    row += 1
                elif row == len(mat)-1:
                    di = 1
                    col += 1
                else:
                    col -= 1
                    row += 1
        return arr





        
        