# time: O(m*n)
# space: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        x,y = 0,0
        dirn = 1
        r,c = len(mat), len(mat[0])

        res = [0]*(r*c)

        for i in range(len(res)):
            print(x,y)
            res[i] = mat[x][y]

            if dirn==1:
                if y==c-1:
                    x+=1
                    dirn=-1
                elif x==0:
                    y+=1
                    dirn=-1
                else:
                    x-=1
                    y+=1
            else:
                if x == r-1:
                    y+=1
                    dirn=1
                elif y == 0:
                    x+=1
                    dirn=1
                else:
                    x+=1
                    y-=1
            
        return res



        