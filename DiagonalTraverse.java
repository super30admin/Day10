// In this we are keeping a direction variable with value as 1 for b->t and -1 for t->b. So, we will start from first row and 
// first col b->t, add that value in result, then it will go in a case where row==0 and dir will change and col will increase. 
// Then it will continue for t->b and so on.

// Time Complexity : O(m*n)
// Space Complexity : O(1) - Because result array is what they are asking us to return. So, no extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Base case
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        // direction variable
        // dir=-1 --> top to bottom
        // dir=1 --> bottom to top
        int dir = 1;
        int row = 0;
        int col = 0;
        int index = 0;
        while (index < m * n) {
            // First value as it is in 1d array
            result[index] = mat[row][col];
            // Increase index
            index++;
            // Check currently t->b or b->t
            if (dir == 1) {
                // If b->t
                // When we are going from bottom to top, we might reach to a value that is
                // present in last column(In eg. value 3)
                if (col == n - 1) {
                    // In that, change the direction and increment only row value
                    dir = -1;
                    row++;
                }
                // There might be a value which is in first row(eg. 1), in that case increment
                // col and change direction
                else if (row == 0) {
                    dir = -1;
                    col++;
                }
                // Else decrement row and increment col
                else {
                    row--;
                    col++;
                }
            } else {
                // Else if going t->b
                // There might be a value which is in last row(eg. 8), in that case increment
                // col and change direction
                if (row == m - 1) {
                    dir = 1;
                    col++;
                }
                // There might be a value which is in first col(eg. 4), in that case increment
                // row and change direction
                else if (col == 0) {
                    dir = 1;
                    row++;

                }
                // Else decrement col and increment row
                else {
                    col--;
                    row++;
                }
            }
        }
        // Return result
        return result;
    }
}