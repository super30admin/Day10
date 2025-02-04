// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
/*
Find the starting index of the traversal (either head or tail)
 */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int N=mat.length;
        int M=mat[0].length;

        int row=0;
        int col=0;
        int direction=1;
        int result[]=new int[N*M];
        int index=0;
        while(row<N && col<M){
            result[index++]=mat[row][col];
            int newRow=row+(direction==1?-1:1);
            int newCol=col+(direction==1?1:-1);
            if(newRow<0 || newRow==N || newCol<0 || newCol==M){
                if(direction==1){
                    row+=(col==M-1)?1:0;
                    col+=(col==M-1)?0:1;
                }
                else {
                    col+=(row==N-1)?1:0;
                    row+=(row==N-1)?0:1;
                }
                direction=1-direction;
            }
            else {
                row=newRow;
                col=newCol;
            }
        }

        return result;
    }
}