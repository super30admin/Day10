##########238. Product of Array Except Self########################################################################################################################################################
// Time Complexity : n
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was unable to find the solution after class understood could be done using pre/post production of elements

// Your code here along with comments explaining your approach in three sentences only
#first tool pre product and than took post product and multiple each element at there position to find the result

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l1=[]
        prod=1
        prod2=1
        for i in range(len(nums)):
            if i>0:
                prod=prod*nums[i-1]
            l1.append(prod)
        #print(l1)
        for j in range(len(nums)-1,-1,-1):
            if j!=len(nums)-1:
                prod2=prod2*nums[j+1]
            #print(l1[j],prod2)
            l1[j]=l1[j]*prod2
        return l1
        
        

##########498. Diagonal Traverse##########################################################################################################################
// Time Complexity : mXn
// Space Complexity : mXn
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : solved after class, so have better idea


// Your code here along with comments explaining your approach in three sentences only
Identified the condition which will reach the matrix and applied specific checks for them

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rowmax=len(mat)
        colmax=len(mat[0])
        total=(rowmax+1)*(colmax+1)
        r,c=0,0
        flag='up'
        #l1=[mat[0][0]]
        l1=[]
        print(rowmax,colmax)
        while r<rowmax and c<colmax:
            l1.append(mat[r][c])
            if flag=='up':
                if c==colmax-1:
                    r+=1
                    flag='down'
                    '''if r<rowmax and c<colmax:
                        l1.append(mat[r][c])'''
                elif r==0:
                    c+=1
                    flag='down'
                    '''if r<rowmax and c<colmax:
                        l1.append(mat[r][c])'''
                else:
                    r-=1
                    c+=1
            
            else:
                if r==rowmax-1:
                    c+=1
                    flag='up'
                elif c==0:
                    r+=1
                    flag='up'
                else:
                    r+=1
                    c-=1
            #print(r,c,flag)
            #print(l1) 
        return l1 




##########54. Spiral Matrix#######################################################################################################################
// Time Complexity : mXn
// Space Complexity : mXn
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I thought of doing the question using sets but after class solved it using iteration. Also the code was failing when initial while condition was mutated so need to check video to identify the extra condition required


// Your code here along with comments explaining your approach in three sentences only
Found 4 pointers, rowmin, column, rowmax, colmax, once traversed each element is reduced
       
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rowmax,colmax=len(matrix)-1,len(matrix[0])-1
        rs,cs=0,0
        #r,c=0,0
        l1=[]
        while rs<=rowmax and cs<=colmax:
            for i in range(cs,colmax+1):
                l1.append(matrix[rs][i])
                print(l1)
            rs+=1
            print(rs,rowmax)
            if rs<=rowmax:
                for j in range(rs,rowmax+1):
                    l1.append(matrix[j][colmax])
                    print(l1)
                colmax-=1
            if cs<=colmax and rs<=rowmax:
                for k in range(colmax,cs-1,-1):
                    l1.append(matrix[rowmax][k])
                    print(l1)
                rowmax-=1
            if rs<=rowmax and cs<=colmax:
                for l in range(rowmax,rs-1,-1):
                    l1.append(matrix[l][cs])
                    print(l1)
                cs+=1
            print('end: ',l1)
            print(rs,cs,rowmax,colmax)
        return l1

        


  