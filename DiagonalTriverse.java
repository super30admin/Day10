// Time complexity:- O(m*n)
// Space complexity:- O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, I faced the problem when first time I solve the problem but after doing dry run I was able to solve


// Your code here along with comments explaining your approach
/**
 * Approach: 
 * This problem is about triverse the matrix diaginally upwards and downwars, I started from the start of the matrix 
 * and triversed each diagonal, adjust the row and column indices whe I hit the boundaries.
 * The direction is changed each time we reach an edge, and the elements are stored in the result array in diagonal order.
 */ 
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // get the number of rows and columns
        int rows = mat.length;
        int cols = mat[0].length;

        //start at start of the matrix 
        int i = 0;
        int j = 0;

        // Create an array to store the result
        int[] result = new int[rows*cols];
        int idx = 0;

        //Set the direction to track the current dirction
        String dir = "up";

        // iterate until all the elements are added to the result array
        while(idx < result.length) {
            // Going upward diagonally
            if(dir.equals("up")) {
                // keep moving upward untill inside the bounds
                while(i >= 0 && i < rows && j < cols) {
                    // add the current element to the result
                    result[idx] = mat[i][j];
                    //increment the result index after adding
                    idx++;
                    i--; // move upward
                    j++; // move right
                }
                //if we are out of bound while going up then back to the correct position 
                i++;
                j--;
                dir = "down"; // set direction to down
                
                // if we are out of bound on the right, move down to the next row
                if(j < cols -1) {
                    j++;
                } else if(j == cols -1){
                    i++;
                }
            } 
            // Going downwards diagonally
            else if(dir.equals("down")) {
                // keep moving downwards untill inside the bounds
                while(i >= 0 && i < rows && j >= 0 && j < cols){
                    result[idx] = mat[i][j];
                    idx++;
                    i++;
                    j--;                    
                }
                //if we are out of bound while going down then back to the correct position                
                j++;
                i--;
                
                dir = "up"; // set direction to up
                // If we are out of bounds at the bottom, move right to the next column
                if(i < rows - 1) {
                    i++;
                } else if(i == rows -1) {
                    j++;
                }
           }
        }
        // return the result
        return result;
    }
}


