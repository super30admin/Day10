#TC: O(M*N)
#SC: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = []

        top = 0
        bottom = m-1
        left = 0
        right = n-1

        while(top <= bottom and left <= right):

            for i in range(left, right+1):
                result.append(matrix[top][i])
            top+=1

            if (top <= bottom and left <= right):
                for j in range(top, bottom+1):
                    result.append(matrix[j][right])
                right-=1

            if (top <= bottom and left <= right):
                for k in range(right, left-1, -1):
                    result.append(matrix[bottom][k])
                bottom-=1

            if (top <= bottom and left <= right):
                for l in range(bottom, top-1, -1):
                    result.append(matrix[l][left])
                left+=1
    
        return result


            

            

            


            
        