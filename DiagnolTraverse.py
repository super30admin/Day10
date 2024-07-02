#Time Complexity: O(mn)
#Space Complexity : O(mn)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        col = len(mat[0])

        res = []
        cur_row = cur_col = 0
        going_up = True

        while len(res) != row * col:
            if going_up:
                while cur_row >= 0 and cur_col < col:
                    res.append(mat[cur_row][cur_col])

                    cur_row -= 1
                    cur_col += 1

                if cur_col == col:
                    cur_row += 2
                    cur_col -= 1
                else:
                    cur_row += 1
                going_up = False 
            
            else:
                while cur_col >= 0 and cur_row < row:
                    res.append(mat[cur_row][cur_col])

                    cur_row += 1
                    cur_col -= 1

                if cur_row == row:
                    cur_col += 2
                    cur_row -= 1
                else:
                    cur_col += 1
                going_up = True
        
        return res