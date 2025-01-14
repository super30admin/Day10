#Time complexity - 0(m*n) & space complexity - o(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) ==0:
            return []
        m= len(matrix)
        n= len(matrix[0])
        result=[]
        top=0
        bottom= m-1
        left =0
        right =n-1

        while top<=bottom and left<=right:
            if top<=bottom and left<=right:
                for i in range(left, right+1):
                    result.append(matrix[top][i])
                top = top+1
            if top<=bottom and left<=right:
                for i in range(top , bottom+1):
                    result.append(matrix[i][right])
                right = right-1
            if top<=bottom and left<=right:
                for i in range(right, left-1,-1):
                    result.append(matrix[bottom][i])
                bottom = bottom-1
            if top<=bottom and left<=right:
                for i in range(bottom, top-1,-1):
                    result.append(matrix[i][left])
                left=left+1
            

        return result


        

    


        