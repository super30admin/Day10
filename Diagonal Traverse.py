# // Time Complexity : O(n * m)
# // Space Complexity : O(n * m) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this: direction part was a bit tricky.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = [0] * (len(mat) * len(mat[0]))
        direction = True
        i = 0
        j = 0
        idx = 0
        print(result)
        while idx < len(mat) * len(mat[0]):
            result[idx] = mat[i][j]
            idx += 1
            if direction:
                if j == len(mat[0])-1:
                    i += 1
                    direction = False
                elif i == 0:
                    j += 1
                    direction = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == len(mat)-1:
                    j += 1
                    direction = True
                elif j == 0:
                    i += 1
                    direction = True
                else:
                    i += 1
                    j -= 1

        return result 
    
# Approach:

# Same as taught in the class.