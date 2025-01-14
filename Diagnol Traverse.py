#Time complexity - 0(m*n) & space complexity - o(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat== None or len(mat)==0:
            return []

        m= len(mat)
        n= len(mat[0])
        result= [ 0 for i in range(m*n)]
       
        index =0
        r=0
        c=0
        dirr=1
        while index<m*n:
            result[index] = mat[r][c]
            index= index+1  
            if dirr==1:
                if c==n-1:
                    r= r+1
                    dirr=-1
                elif r==0:
                    c= c+1
                    dirr=-1
                else:
                    r= r-1
                    c=c+1
            elif dirr== -1:
                if r== m-1:
                    c= c+1
                    dirr=1
                elif c==0:
                    r=r+1
                    dirr=1
                else:
                    r=r+1
                    c=c-1
        return result
            

            


            

    



