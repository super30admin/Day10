class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
          return []

        rows=  len(mat)
        cols = len(mat[0])
        res = []
        r = c = 0
        going_up = True
        while len(res) != (rows*cols):
          if going_up == True:
            while r >= 0 and c < cols:
              res.append(mat[r][c])
              c += 1
              r -= 1

            if c == cols:
              r += 2
              c -= 1
            elif r< 0:
              r += 1
            
            going_up = False
          
          if going_up == False:
            while r < rows and c >= 0:
              res.append(mat[r][c])
              r += 1
              c -= 1
          
            if r == rows:
              r -= 1
              c += 2
            elif c < 0:
              c += 1
            
            going_up = True
        
        return res