class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)  # Number of rows
        n = len(mat[0])  # Number of columns
        final_len = m * n  # Total number of elements
        res = [0] * final_len  # Initialize result array
        up_dir = True  # Direction flag
        r, c = 0, 0  # Start from top-left

        for i in range(final_len):
            res[i] = mat[r][c]  # Store current element
            if up_dir:  # Moving upward
                if r == 0 and c != n - 1:  # Hit the top row
                    c += 1
                    up_dir = False
                elif c == n - 1:  # Hit the right column
                    r += 1
                    up_dir = False
                else:  # Move diagonally up
                    r -= 1
                    c += 1
            else:  # Moving downward
                if c == 0 and r != m - 1:  # Hit the left column
                    r += 1
                    up_dir = True
                elif r == m - 1:  # Hit the bottom row
                    c += 1
                    up_dir = True
                else:  # Move diagonally down
                    r += 1
                    c -= 1
        return res


# time complexity is O(m*n) where m is the number of rows and n is the number of columns
# space complexity is O((m*n) which is size of result array
