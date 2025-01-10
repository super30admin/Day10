# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
# to traverse the matrix diagonally - variables dir is used and row and col pointers are modified
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        if not mat or len(mat) == 0: 
            return result

        dir = 1
        m = len(mat)
        n = len(mat[0])
        row, col = 0, 0 

        while len(result) < m*n:
            result.append(mat[row][col])
            #direction bottom to top
            if dir == 1:
                if col == n-1:
                    row += 1
                    dir = -1
                elif row == 0:
                    col += 1
                    dir = -1
                else:
                    row -= 1
                    col += 1

            #direction top to bottom
            else:
                if row == m-1:
                    col += 1
                    dir = 1
                elif col == 0:
                    row += 1
                    dir = 1
                else:
                    row += 1
                    col -= 1
        return result