#Time: O (rown*column)
#Space: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m= len(matrix)
        n= len(matrix[0])
        left= 0
        right= n-1 
        top =0
        bottom = m -1 
        arr = list()

        print('left, right, top, bottom', left, right,top, bottom)


        while( left <= right and  top <= bottom):
            #for moving left to right
            for i in range(left, right+1):
                arr.append(matrix[top][i])
            top = top +1
            # for moving top to bottom
            for i in range(top, bottom+1):
                arr.append(matrix[i][right])
            right = right -1
            #for moving right to left
            if( top <= bottom):
                for i in range(right, left - 1,-1):
                    arr.append(matrix[bottom][i])   
                bottom = bottom -1
            #for moving bottom to top
            if(left <= right):
                for i in range(bottom,top-1,-1):
                    arr.append(matrix[i][left])   
                left = left + 1
        return arr



        
