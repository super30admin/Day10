// Approach: The idea is to maintain the corners of the matrix yet to be traversed and to continuously update the boundaries of the matrix
// during traversal. Print, in order, the first row, last column, last row, and first column of the matrix within the current boundaries
// until there are no rows or columns left to print.
// Time Complexity: O(m * n) where m = #rows and n = #cols
// Space Complexity: O(1)

// https://leetcode.com/problems/spiral-matrix/description/

public class SpiralOrder {

    void print(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix can't be null or empty");
        }
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            // print top row of matrix with current boundaries
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // print last (right most) column of matrix with current boundaries
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // print last row of matrix with current boundaries
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // print first (left most) column of matrix with current boundaries
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        SpiralOrder so = new SpiralOrder();
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        so.print(matrix); // prints [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}