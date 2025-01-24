// Approach: Maintain two pointers to indicate the indices of the current row and column during traversal. The sum of the row index and
// column index determines the direction of traversal: if the sum is even, move diagonally upward; if it is odd, move diagonally downward.
// Handle edge cases appropriately while updating the pointers.
// Time Complexity: O(m * n) where m = #rows and n = #cols
// Space Complexity: O(1)

// https://leetcode.com/problems/diagonal-traverse/description/

public class DiagonalTraversal {

    void print(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix can't be null or empty");
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            System.out.print(matrix[i][j] + " ");

            if ((i + j) % 2 == 0) { // direction is UP
                i--;
                j++;
//                if (i < 0 && j == n) {
//                    j--;
//                    i += 2;
//                } else if (i < 0) {
//                    i++;
//                } else if (j == n) {
//                    j--;
//                    i += 2;
//                }
                if (j == n) {
                    j--;
                    i += 2;
                } else if (i < 0) {
                    i++;
                }
            } else { // direction is DOWN
                j--;
                i++;
//                if (j < 0 && i == m) {
//                    i--;
//                    j += 2;
//                } else if (j < 0) {
//                    j++;
//                } else if (i == m) {
//                    i--;
//                    j += 2;
//                }
                if (i == m) {
                    i--;
                    j += 2;
                } else if (j < 0) {
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        DiagonalTraversal dt = new DiagonalTraversal();
//        int[][] matrix = {{}};
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        dt.print(matrix); // prints [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]
    }
}