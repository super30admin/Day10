#Leetcode problem: 289
class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m=len(board)
        n=len(board[0])
        
        #1->0=2
        #0->1=3
        for i in range(m):
            for j in range(n):
                count=self.countlives(board,i,j,m,n)
                if (board[i][j]==1 and (count<2 or count>3)):
                    board[i][j]=2
                elif (board[i][j]==0 and count==3):
                    board[i][j]=3
                    
        for i in range(m):
            for j in range(n):
                if board[i][j]==2:
                    board[i][j]=0
                elif board[i][j]==3:
                    board[i][j]=1
                    
    def countlives(self,board,i,j,m,n):
        res=0
        dire=[(0,1),(0,-1),(1,0),(-1,0),(1,1),(1,-1),(-1,1),(-1,-1)]
        
        for d in dire:
            x=i+d[0]
            y=j+d[1]
            
            if (x>=0 and x<m and y>=0 and y<n and (board[x][y]==1 or board[x][y]==2)):
                res+=1
        return res

#TC: O(m*n)
#SC: O(1)