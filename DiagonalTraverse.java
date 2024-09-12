// Time Complexity : O(m*n), m = total rows, n = total columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat==null)
            return new int[0];
        
        int dir=1, m=mat.length, n=mat[0].length, i=0, row=0, col=0;
        int[] result = new int[m*n];
        while(i<m*n) {
            //updating values in result array
            result[i++] = mat[row][col];
            //up direction
            if(dir==1) {
                if(col==n-1) {
                    row++;
                    dir=-1;
                }
                else if(row==0){
                    col++;
                    dir=-1;
                }
                else {
                    row--;
                    col++;
                }
            }
            //down direction
            else {
                if(row==m-1) {
                    col++;
                    dir=1;
                }
                else if(col==0) {
                    row++;
                    dir=1;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
