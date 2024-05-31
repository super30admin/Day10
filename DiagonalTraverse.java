// Time Complexity : O(N) = O(N) => As we iterate over all the elements
// Space Complexity : O(1) => Even though we are creating a new array of size N but we are returning that same array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. Need to think about all the edge cases

/*
Approach: Used variable direction wherein if direction is 1 we are calculating values for bottom to top.
If direction is -1 we are calculating for top to bottom.
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat.length == 0 || mat == null) {
            return new int[] {};
        }

        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int direction = 1;
        int row = 0;
        int col = 0;
        // Calculates if travesing from bottom to top

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[row][col];

            //Calculates for bottom to top
            if (direction == 1) {
                if (col == n - 1) {
                    direction = -1;
                    row++;
                } else if (row == 0) {
                    direction = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            }
            //Calculates for top to bottom
            else {
                if (row == m - 1) {
                    direction = 1;
                    col++;
                } else if (col == 0) {
                    direction = 1;
                    row++;
                } else {
                    row++;
                    col--;
                }
            }


        }
        return result;
    }
}