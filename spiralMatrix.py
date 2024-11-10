"""
TC: O(n*m) SIze of matrix
SP:O(1)  No additional space except fot result array
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left, right = 0, len(matrix[0])
        top, bot = 0, len(matrix)
        res = []
        while left<right and top<bot:
            #top row
            for i in range(left, right):
                res.append(matrix[top][i])
            top+=1
            #right col
            for i in range(top, bot):
                res.append(matrix[i][right-1])
            right-=1
            if not (left<right and top<bot):
                break
            #right to left
            for i in reversed(range(left, right)):
                res.append(matrix[bot-1][i])
            bot-=1
            #bot to top
            for i in reversed(range(top, bot)):
                res.append(matrix[i][left])
            left+=1
        return res
            

        