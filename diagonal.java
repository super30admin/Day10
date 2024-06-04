
// Time Complexity : O( m * n)
// Space Complexity : O( 1 )
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : We take into account two parameters row and col and visualise where our traversal would be
// at any given position, we find out that we move in 2 directions - top to bottom and bottom to top. In the first case, we identified
// that we'll keep a variable dir and keep it 1 and in the latter case we will keep it -1. We then simply change row and col depending upon the
// situation

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null && mat.length == 0){
            return new int[] {};
        }
        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int dir = 1; // direction variable
        int index = 0; // index of the result array
        while(index < m * n){
            result[index] = mat[row][col];
            index++; 
            if(dir == 1){ // moving bottom to top
                if(col == n - 1){ // edge case, if we are at top right side
                    row++;
                    dir=-1;
                }else if(row == 0){ // first row
                    col++;
                    dir=-1;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m - 1){ // edge case if we are at the last row
                    col++;
                    dir=1;
                }else if(col == 0){
                    row++;
                    dir=1;
                }else{
                    col--;
                    row++;
                }
            }
        }

        return result; // return the result array
    }
}