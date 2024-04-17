class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix)     #rows
        n = len(matrix[0])  #columns
        top = 0
        bottom = m-1 
        left = 0
        right = n-1
        result = []*(m*n)

        while top<=bottom and left<=right:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1

            if top<=bottom and left<=right:
                for j in range(top,bottom+1):
                    result.append(matrix[j][right])
            right-=1

            if top<=bottom and left<=right:
                for k in range(right,left-1,-1):
                    result.append(matrix[bottom][k])
            bottom-=1

            if top<=bottom and left<=right:
                for l in range(bottom,top-1,-1):
                    result.append(matrix[l][left])
            left+=1

        return result

obj = Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
result = obj.spiralOrder(mat)
print(result)