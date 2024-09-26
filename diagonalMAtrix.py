#TimeComplexity:O(MN) 
#SpaceComplexity: Constant space
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0 or matrix==None:
            return None
        DM=[]
        m=len(matrix) #rows
        n=len(matrix[0]) #cols
        dir=1

        i,j=0,0
        while i<=m-1 and j<=n-1:
            if dir==1:
                if j==n-1:
                    DM.append(matrix[i][j])
                    i+=1;dir=-1
                elif i==0:
                    DM.append(matrix[i][j])
                    j+=1;dir=-1
                else:
                    DM.append(matrix[i][j])
                    i-=1;j+=1
            if (i<=m-1 and j<=n-1):
                if dir==-1:
                    if i==m-1:
                        DM.append(matrix[i][j])
                        j+=1;dir=1
                    elif j==0:
                        DM.append(matrix[i][j])
                        i+=1;dir=1
                    else:
                        DM.append(matrix[i][j])
                        i+=1;j-=1
        return DM
