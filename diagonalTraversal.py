"""
TC: O(n*m) siz eof matrix
SP:O(n*m)  for storing the values in hmap
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        hmap = defaultdict(list)
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                hmap[i+j].append(mat[i][j])
        res = []
        reverse = True
        for v in hmap.values():
            if not reverse:
                res.extend(v)
                reverse = True
            else:
                res.extend(reversed(v))
                reverse = False
        return res
