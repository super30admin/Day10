# """
# This is BinaryMatrix's API interface.
# You should not implement it, or speculate about its implementation
# """
# class BinaryMatrix(object):
#    def get(self, row: int, col: int) -> int:
#    def dimensions(self) -> list[]:

class Solution:
    """O(m+n approach)

    https://leetcode.com/problems/leftmost-column-with-at-least-a-one/solution/


    """

    def leftMostColumnWithOne(self, binaryMatrix: 'BinaryMatrix') -> int:
        n, m = binaryMatrix.dimensions()
        print(n, m)
        # m=len(binaryMatrix[0])
        row = 0
        col = m - 1
        print(col)
        while row < n and col >= 0:
            print(binaryMatrix.get(row, col))
            if binaryMatrix.get(row, col) == 1:
                print("found 1 on row,col", row, col)
                col -= 1
            else:
                "could not find"
                ##we could not find one in the same row
                row += 1
        ###we found  the col but has gone to -1 so we need to plus one
        if col == m - 1:
            ###never moved the pointer, never found 1
            return -1
        else:
            return col + 1


