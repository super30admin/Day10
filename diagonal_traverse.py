"""
brute force approach: for each diagonal, the sum of row and column of each number in that diagonal is the same.
So we can store the (row,col) of each diagonal in a hmap where total is key, and value is list of
a row and col pair. Traverse the hmap using min and max values, when the direction is upwards access the hmap
value, which is a list of row and col pair in reverse direction and store the matrix value at that row and col.
order.
Time complexity: O(n^2) and space complexity: O(m*n)

Optimal way: separate the logic for the two directions. To print numbers in upward direction do: r-- and c++ and this
would have 2 edge cases, while traversing up, the row might go out of bound when it does so increment col. But there
is a catch here what if it is the last element of the 0th row then in this edge case, need to add one more condition
making sure the col is also in bound (r == 0 and c!= n-1) and change the direction. That is, increment the col only
when col is in bound. What if col is out of bound? then increment row and change direction. For downward direction:
r++ and c--, this also has 2 edge cases: col goes out of bound, increment row and change direction. What if row also
goes out of bound? so increment row only if row is not out of bound. What if the row is out of bound? increment col and
change direction.
Time complexity: O(m*n) and space complexity: O(1)

To do: optimal way
"""
from typing import List


# class Solution:
    # def findDiagonalOrder_optimal(self, mat: List[List[int]]) -> List[int]:
    #     ans = []
    #     # for upward direction:
    #     if row <
    #     r--
    #     c++


    def findDiagonalOrder_bruteforce(self, mat: List[List[int]]) -> List[int]:
        def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
            hmap_dia = {}
            ans = []
            rows = len(mat)
            cols = len(mat[0])

            for r in range(rows):
                for c in range(cols):
                    total = r + c
                    if total not in hmap_dia:
                        hmap_dia[total] = []
                    hmap_dia[total].append([r, c])

            total_min = 0
            total_max = rows + cols - 1
            updir = True
            for total in range(total_min, total_max):
                lst = hmap_dia[total]
                if not updir:
                    for l in lst:
                        val = mat[l[0]][l[1]]
                        ans.append(val)
                    updir = True
                else:
                    for i in range(len(lst) - 1, -1, -1):
                        l = lst[i]
                        val = mat[l[0]][l[1]]
                        ans.append(val)
                    updir = False

            return ans

