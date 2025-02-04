// https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(m*n) where m is the number of rows and n is the number of columns in the matrix
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We are traversing the matrix in the direction of the diagonal. We are using a boolean variable to keep track of the direction of the diagonal. We are updating the row and column based on the direction of the diagonal.

// Your code here along with comments explaining your approach


class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];
        boolean dir = true;
        int row = 0, col = 0;

        for(int i = 0; i < res.length; i++){
            res[i] = mat[row][col];

            if(dir){
                if(col == n-1){
                    row++;
                    dir = false;
                }else if(row == 0){
                    col++;
                    dir = false;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m-1){
                    col++;
                    dir = true;
                }else if(col == 0){
                    row++;
                    dir = true;
                }else{
                    col--;
                    row++;
                }
            }
        }
        return res;
    }
}