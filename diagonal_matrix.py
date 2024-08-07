# will it only be a square matrix?
# Time complexity = O(m*n)
# Space complexity = O(1)
# Tested on Leetcode
# using dirs flag to track up and down, incrementing or decrementing the i,j indexes
# Note adding conditions for upper right and bottom left 
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # [0,0]
        # [1,0] [0,1]
        # [2,0] [1,1] [0,2]
        # [2,1] [1,2]
        # [2,2]

        dir = True
        r = c = 0
        n = len(mat[0])
        m = len(mat)
        result = [0]*(m*n) 

        for i in range(m*n):
            result[i] = mat[r][c]

            if (dir):
                # to handle corner cases where both conditions meet top-right
                
                if (r == 0) and (c != n-1): 
                    c += 1
                    dir = not dir
                elif (c == n-1):
                    r += 1 
                    dir = not dir
                else:
                    r -= 1
                    c += 1
            else:
                # to handle bottom-left element where both conditions meet
                if (c == 0) and (r != m-1):
                    r += 1
                    dir = not dir
                elif (r == m-1):
                    c += 1 
                    dir = not dir
                else:
                    r += 1
                    c -= 1
        return result





        # # O (min (n, m)) space
        # n = len(mat)
        # m = len(mat[0])

        # ans = []

        # r = i = j = c = 0
        # order = 1
        # while 1:
        #     i = r
        #     j = c
        #     t = []
        #     while 0 <= i < n and 0 <= j < m:
        #         t.append(mat[i][j])
        #         i -= 1
        #         j += 1

        #     if order == 1:
        #         ans.extend(t)
        #     else:
        #         ans.extend(t[::-1])
            
        #     order *= -1
        #     r += 1
            
        #     if r == n:
        #         r -= 1
        #         c += 1
        #     if c == m:
        #         break
        
        # return ans
