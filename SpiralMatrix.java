// Time Complexity : O(m*n) => As we iterate over the entire 2D matrix of m rows and n columns
// Space Complexity : O(1) => Even though we are creating a new array list but we are returning that same array list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. Need to add conditions again to check if top <= bottom & left <= right

/*
Approach: Used 4 for loops for adding values from left to right column, top to bottom, right to left and bottom to top
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0 || matrix == null) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Initiazliing 4 variables top and bottom for rows & left and right for columns
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        int row = 0;
        int column = 0;

        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {

            // Calculates value from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Calculates value from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Calculates value from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Calculates value from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}