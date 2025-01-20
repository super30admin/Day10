"""
Time Complexity: 0(mn)
Space Complexity: 0(1)
Approach: Use 2 ptrs + dir ptrs and update accordingly
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        

        rows = len(mat)
        cols = len(mat[0])

        # dir -- up(1) and down(-1)
        count = rows*cols
        result = []
        dir = 1

        # set the initial ptrs
        r = 0
        c = 0

        while True:

            # append the value to the result
            result.append(mat[r][c])

            # update the count 
            count -= 1

            if count == 0:
                break

            # up
            if dir == 1:    

                # case-1
                if r == 0 and c < cols-1:
                    c = c + 1
                    dir = -1

                # case-2
                elif c == cols - 1:
                    r = r + 1
                    dir = -1

                # case-3
                else:
                    r = r - 1
                    c = c + 1


            # down
            elif dir == -1:

                # case-1
                if c == 0 and r != rows - 1:
                    r = r + 1
                    dir = 1

                # case-2
                elif r == rows - 1:
                    c = c + 1
                    dir = 1

                # case-3
                else:
                    r = r+1
                    c = c-1
        
        # end of while loop

        return result


