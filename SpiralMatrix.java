// In this we are declaring 4 variables for 4 directions and running loop for each of the direction and then repeating it until
// all the elements are flattened

// Time Complexity : O(m*n)
// Space Complexity : O(1) - Because result array is what they are asking us to return. So, no extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Base Case
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // Declaring 4 variables for running loop in 4 directions
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        // Declaring arraylist for result
        ArrayList<Integer> result = new ArrayList<>();
        // When left>right or top>bottom, that means we have flattened all elements of
        // matrix
        while (left <= right && top <= bottom) {
            // Run first loop from column as left to right, and row as top only to print
            // elements in first row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            // Increment top to avoid duplicating the element while running next loop
            top++;
            // Run second loop from row as top to bottom, and column as right only to print
            // elements in last column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            // Then decrement right to avoid duplicate
            right--;
            // Do check again for top and bottom as we are top++ above. Note check for
            // right-- is already covered in third for loop
            if (top <= bottom) {
                // Run third loop from column as right to left, and row as bottom only to print
                // elements in last row
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                // Then decrement bottom
                bottom--;
            }
            // Do check again for left and right as we are right-- above. Note check for
            // bottom-- and top++ is already covered in condition of fourth for loop
            if (left <= right) {
                // Run fourth loop from row as bottom to top, and column as left only to print
                // elements in first column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                // Then left++
                left++;
            }

        }
        // Return result
        return result;
    }
}