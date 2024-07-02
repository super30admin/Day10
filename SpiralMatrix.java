// Time Complexity : O(N*M)
// Space Complexity : O(N*M)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Initialize the boundaries of the matrix
        int left = 0; // Left boundary
        int top = 0; // Top boundary
        int right = matrix[0].length - 1; // Right boundary
        int bottom = matrix.length - 1; // Bottom boundary

        // List to store the spiral order
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until the boundaries overlap
        while (left <= right && top <= bottom) {
            // Traverse from left to right along the top boundary
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            // Check if there are remaining rows to process
            if (top <= bottom) {
                // Traverse from right to left along the bottom boundary
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }

            // Check if there are remaining columns to process
            if (left <= right) {
                // Traverse from bottom to top along the left boundary
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
        }

        // Return the list containing the spiral order
        return list;
    }
}
