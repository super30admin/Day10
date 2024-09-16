#Leetcode Problem 498
#keep track of direction, row and columns
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        res=[]
        m=len(mat)
        n=len(mat[0])
        size=m*n
        dire=1
        r=0
        c=0
        while(len(res)<size):
            res.append(mat[r][c])
            if dire==1:
                if(c==n-1):
                    dire=-1
                    r+=1
                
                elif(r==0):
                    dire=-1
                    c+=1
                    
                else:
                    r-=1
                    c+=1      
                    
            else:
                if(r==m-1):
                    dire=1
                    c+=1
                        
                elif(c==0):
                    dire=1
                    r+=1
                    
                else:
                    r+=1
                    c-=1
        return res

#TC: O(m*n)
#SC: O(1) we are supposed to return list and no extra space is used.