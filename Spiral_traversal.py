class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        cols = len(matrix[0])

        top = left = 0
        right = len(matrix[0])-1
        bottom = len(matrix)-1
        res =[]
        direction = "r"
        while top<= bottom and left <= right:
          if direction == "r":
            for c in range(left, right+ 1):
                res.append(matrix[top][c])
            top +=1 
            direction = "d"
          
          elif direction ==  "d":
            for r in range(top , bottom+1):
              res.append(matrix[r][right])
            right -= 1
            direction = "l"
          
          elif direction == "l":
            for c in range(right, left - 1, -1):
              res.append(matrix[bottom][c])
            
            bottom -= 1
            direction = "u"
          
          elif direction == "u":
            for r in range(bottom, top -1, -1 ): 
              res.append(matrix[r][left])
            
            left += 1
            direction = "r"
        return res



        
            





# class Solution:
#     def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#         rows = len(matrix)
#         cols = len(matrix[0])

#         r = c = 0
#         res = {}
#         direction = 1
#         while len(res) != (len(matrix)* len(matrix[0])):
#           if direction == 1:
#             while c < cols and matrix[r][c] not in res:
#               res[matrix[r][c]] = matrix[r][c]
#               c += 1
#             c -= 1
#             r += 1
#             direction = 0

#           if direction == 0:
#             while r < rows and matrix[r][c] not in res:
#               res[matrix[r][c]] = matrix[r][c]
#               r += 1
#             r -= 1
#             c -= 1
#             direction = -1
          
#           if direction == -1:
#             while c >= 0 and matrix[r][c] not in res:
#               res[matrix[r][c]] = matrix[r][c]
#               c -=1
#             c += 1
#             r -= 1
#             direction = 2
          
#           if direction == 2:
#             while r >=0 and matrix[r][c] not in res: 
#               res[matrix[r][c]] = matrix[r][c]
#               r -= 1
#             r += 1
#             c += 1
#             direction = 1

#         return list(res.keys())


            


