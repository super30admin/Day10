public class DiagonalOrder {
    public static int[] findDiagonalOrder(int[][] matrix) {
        // Check for empty matrix
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        // Get number of rows and columns
        int m = matrix.length;
        int n = matrix[0].length;

        // Create result array to store diagonal elements
        int[] result = new int[m * n];

        // Initialize variables for current row, column, and direction
        int row = 0, col = 0, d = 1;

        // Iterate over all elements in the matrix
        for (int i = 0; i < m * n; i++) {
            // Add current element to result array
            result[i] = matrix[row][col];

            // Move to next diagonal element
            row -= d;
            col += d;

            // If we go out of bounds, change direction and adjust row/column
            if (row >= m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            if (row < 0) {
                row = 0;
                d = -d;
            }
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        // Return the result array
        return result;
    }
}
