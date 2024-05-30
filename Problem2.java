// Time Complexity : O(m * n)
// Space Complexity : O(1) as we are using only 1 array and we are returning it.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:

// Traverse the matrix diagonally, alternating directions: up-right and down-left.
// Adjust row and column indices at the boundaries, changing the direction and updating indices appropriately.
// Collect each element in the result array as you traverse, ensuring you cover all elements by following the diagonal pattern until the entire matrix is processed.

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat == null || mat.length == 0){
            return new int[] {};
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int index =0;
        int row =0, col =0, dir =1;

        while(index < m * n){
            result[index] = mat[row][col];
            index ++;

            // move in the direction of bottom to top
            if(dir == 1){
                if(col == n-1){
                    dir = -1;
                    row++;
                }
                else if(row == 0){
                    dir = -1;
                    col++;
                }
                else{
                    row --;
                    col++;
                }
            }

            // move in the direction of top to bottom
            else{
                if( row == m-1){
                    dir =1;
                    col++;
                }
                else if( col == 0){
                    dir =1;
                    row++;
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