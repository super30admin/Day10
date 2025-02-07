'''
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : I created a function to get the start of any diagonal using indexes. I also created a function which traversers the diagonal.

// Your code here along with comments explaining your approach
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        def get_start_pos(d, m, n, going_up):
            if going_up:
                if d < m:
                    return d, 0
                return m - 1, d - m + 1
            # Going down
            if d < n:
                return 0, d
            return d - n + 1, n - 1
    
        def traverse_diagonal(mat, i, j, going_up):
            output = []
            while i >= 0 and j >= 0 and i < len(mat) and j < len(mat[0]):
                output.append(mat[i][j])
                if going_up:
                    i -= 1
                    j += 1
                else:
                    i += 1
                    j -= 1
            return output

        going_up = True
        output = []
        m = len(mat)
        n = len(mat[0])
        for d in range(m + n):
            i, j = get_start_pos(d, m, n, going_up)
            output = output + traverse_diagonal(mat, i, j, going_up)
            going_up = not going_up
        return output