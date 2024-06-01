// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0 ){
            return new int []{};
        }
        int dir = 1;
        int row = 0;
        int col = 0;
        int index = 0;
        int m = mat[0].length; // column
        int n = mat.length; // rows
        int [] res = new int[m*n];
        while(index < m*n)
        {  // 1 > bottom to top
           // -1 > top to bottom
            res[index++] = mat[row][col];
            
            if(dir == 1){
                if(col == m-1){ // If reached top right corner(3)  change row and direction 
                    dir = -1;
                    row++;
                }
                else if(row == 0){ // If reached top row(2) change column and direction 
                    dir = -1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == n-1){ // If reached bottom left corner change row and direction 
                    dir = 1;
                    col++;
                }
                else if(col == 0){ // If reached first column change direction and row
                    dir = 1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }

            }
            
            
        }
        return res;
    }
}