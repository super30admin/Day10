// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traverse the matrix in a spiral order, starting from the top-left corner, and collects the
// elements while updating the boundaries after each direction change.

// Your code here along with comments explaining your approach

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Boundaries for the spiral traversal
        int top = 0; int bottom = m - 1;
        int left = 0; int right = n - 1;
        List<Integer> result = new ArrayList<>();;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Traverse from top to bottom along the rightmost column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            if (left <= right) {
                // Traverse from bottom to top along the leftmost column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}
