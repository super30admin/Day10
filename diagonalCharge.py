# // Time Complexity :O(m*n) for matrix traversal
# // Space Complexity : O(m*n) for result matrix 
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# We initialize a resultant array m*n. We set a direction flag true if clockwise. False if anticlockwise.
# There will be 3 cases for each, i) edge case 0, ii) edge case n-1, iii) regular case
# We can use one loop of m*n instead of 2 loops to store diagonals in result array.

# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        m = len(mat)            # col
        n = len(mat[0])         # row
        r,c = 0,0
        dire = True
        result = [0] * (m*n)
    
        for i in range(m*n):
            result[i] = mat[r][c]               # update
            if dire:                            # direction = True
            # up-right
                if (r == 0 and c != n-1):           # edge case 0
                    c+=1
                    dire = False 
                elif (c == n-1):                    # edge case n-1
                    r+=1
                    dire = False
                else:                               # regular case
                    r-=1
                    c+=1
            else:                               # direction = False
                # down-left
                if (c ==0 and r != m-1):            # edge case 0
                    r+=1
                    dire = True
                elif (r == m-1):                    # edge case n-1
                    c+=1
                    dire = True                        
                else:                               # regular case
                    r+=1
                    c-=1

        return result


print(Solution().findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
        