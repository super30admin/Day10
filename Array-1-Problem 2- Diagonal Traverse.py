"""
 FAANMG Problem #27 {Medium}

498. Diagonal Traverse

Time Complexity : O(MN)



Space Complexity : O(N)
Size of the Column


Did this code successfully run on Leetcode : Yes
    

Im using a hashmap to store the values in an array
The values are grouped by the sum of the (i,j) as key


then iterating throught the hashmap and appending it to the res array 
 The direction is changed based on odd even

                  

@name: Rahul Govindkumar_RN27JUL2022
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        
        hashmap = {}
        result =[]
        
        m = len(mat)
        n = len(mat[0])
        
        for i in range(m):
            for j in range(n):
                key = i+j
                
                if(key in hashmap):
                    hashmap[key].append(mat[i][j])
                else:
                    hashmap[key]=[mat[i][j]]
                      
        for key in range(len(hashmap)):
            if(key % 2 != 0):
                for idx in range (len (hashmap[key])):
                    result.append(hashmap[key][idx])
            else:
                for idx in range (len(hashmap[key])-1 ,-1,-1):
                    result.append(hashmap[key][idx])
                
        return result
                    
    
"""
 FAANMG Problem #27 {Medium)

498. Diagonal Traverse

Time Complexity : O(MN)



Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
    

Two Flgas are maintained for the direction 1 and -1

and based on the direction the row and column is incremented
                  

@name: Rahul Govindkumar_RN27JUL2022
"""    
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        
        result=[0]*(m*n)
        
        r=0
        c=0
        direction = 1
        idx =0
        
        while(idx < len(result)):
            result[idx]=mat[r][c]
            idx += 1
            
            #Upward direction
            if(direction == 1):
                
                #If the pointer is at the last column (the diagonal)
                # then Goto next row and chnage the direction
                if(c == n-1):   
                    r +=1 
                    direction =-1
                
                #if the pointer is at the top row then move to next value and chnage the direction
                elif (r == 0):
                    c +=1
                    direction =-1
                else:
                    # decrement the row and increment the column : keep on going in same direction
                    r -= 1
                    c += 1
            
            #Downward Direction
            else:
                
                #If the pointer is at the last row (the diagonal)
                # then Goto next col and chnage the direction                
                if(r == m-1):
                    c +=1
                    direction =1
                    
                 #if the pointer is at the bottom column then move to next value and chnage the direction               
                elif (c == 0):
                    r +=1
                    direction =1
                    
                #keep moving in the same direction by decrementing the col nas increasing the row
                else:
                    c -= 1
                    r += 1
                    
        return result
                
            
            
            
            
            
            
            
            
            
            
        
       