# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# add element to result arr then change dir flag if reached the edge of matrix
# if dir is true dir is upwards so col++ and row--
# if dir is false dir is right so row++ and col++
def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        res = [0] * (m*n)
        dir = True
        r = 0
        c = 0

        for i in range(m*n):
            res[i] = mat[r][c]
            if dir:
                if( r == 0 and c!= n-1):
                    c+=1
                    dir = False
                elif(c == n-1):
                    r+=1
                    dir = False
                else:
                    r-=1
                    c+=1
            else:
                if( c == 0 and r!= m-1):
                    r+=1
                    dir = True
                elif(r == m-1):
                    c+=1
                    dir = True
                else:
                    r+=1
                    c-=1
        return res
