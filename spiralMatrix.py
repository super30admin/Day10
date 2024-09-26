#TimeComplexity:O(MN) 
#SpaceComplexity: Constant space
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        sm=[]
        T,L,R,B=0,0,len(matrix[0])-1,len(matrix)-1
        if matrix==None or len(matrix[0])==0 or len(matrix)==0:
            return sm
        while (T<=B and L<=R):
            for i in range(L,R+1):
                sm.append(matrix[T][i])
            T+=1
            for i in range(T,B+1):
                sm.append(matrix[i][R])
            R-=1
            if T<=B and L<=R:
                for i in reversed(range(L,R+1)):
                    sm.append(matrix[B][i])
                B-=1                    
                for i in reversed(range(T,B+1)):
                    sm.append(matrix[i][L])
                L+=1
        return sm
