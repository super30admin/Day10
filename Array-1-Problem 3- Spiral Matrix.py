"""
 FAANMG Problem #28 {Medium }


54. Spiral Matrix

Time Complexity : O(MN)



Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
    

Here we have initialised 4 pointers 
        left = 0
        right = n-1
        top = 0
        bottom = m-1
                  
We are traversing from 
    left to right: this indicate we have completed top most row:-- then to go to next row we are doing top++
    top to bottom: this indicate we have completed right most col:--  then to go to next col we are doing right--
    right to left: this indicate the bottom is traversed :-- then to go to before row we are doing bottom--
    bottom to up: this indicate that we have completed the left col :-- then left++

loop until the pointer cross


@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        
        result =[]
        
        while(top <= bottom and left <= right):
            
            #top row
            if (top <= bottom and left <= right):
                for j in range (left, right+1):
                    result.append(matrix[top][j])
                
            top +=1
            
            #right row
            
            if(top <= bottom and left <= right):
                for i in range (top, bottom +1):
                    result.append(matrix[i][right])
                
            right -=1
            
            
            #bottom row
            if(top <= bottom and left <= right):
                for j in range (right, left - 1, -1):
                    result.append(matrix[bottom][j])

            bottom -=1
            
            #left row
            if(top <= bottom and left <= right):
                for i in range (bottom, top - 1,-1):
                    result.append(matrix[i][left])

            left +=1
            
        return result
            
  
"""
 FAANMG Problem #28 {Medium }


54. Spiral Matrix

Time Complexity : O(MN)



Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
    
Above logic with Recursion
                  

@name: Rahul Govindkumar_RN27JUL2022
"""        
  
        
class Solution:
    
    
    
    def spiralHelper(self, matrix, left , right, top ,bottom, result):
        

        
        if(top > bottom and left > right ):
            return
        #top row
        if (top <= bottom and left <= right):
            for j in range (left, right+1):
       
                result.append(matrix[top][j])
            

        top +=1

        #right row

        if(top <= bottom and left <= right):
            for i in range (top, bottom +1):
                result.append(matrix[i][right])

        right -=1


        #bottom row
        if(top <= bottom and left <= right):
            for j in range (right, left - 1, -1):
                result.append(matrix[bottom][j])

        bottom -=1

        #left row
        if(top <= bottom and left <= right):
            for i in range (bottom, top - 1,-1):
                result.append(matrix[i][left])

        left +=1

        self.spiralHelper(matrix, left , right, top ,bottom,result)

        
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        result =[]
       
        
        if(m == 0):
            return result
        
        self.spiralHelper(matrix, left , right, top ,bottom,result)
        
        return result
            
        
        
        
        
                
        
        