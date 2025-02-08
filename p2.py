#Time complexity o(mn)
#Space complexity o(1)
#Worked on Leet code:yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        r = len(mat)
        c= len(mat[0])
        res= [None]*(c*r)
        i=0
        matr=0
        matc=0
        di=1 #1=up,0=down

        while i<(r*c):
            res[i]= mat[matr][matc]
            if di ==1: #moving up
                if matc+1>=c: #right boundry
                    matr+=1
                    di=0
                elif matr-1<0: # Top Boundry
                    matc+=1
                    di=0
                else:
                    matr-=1
                    matc+=1
            else:  #moving down
                if matr+1>=r: # bottom boundry
                    matc+=1
                    di=1
                elif matc-1<0: #  Left boundry
                    matr+=1
                    di=1
                else:
                    matr+=1
                    matc-=1
            i+=1
        return res


