import java.util.Arrays;

public class DiagonalTraverse {
            public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int[] result = new int[m * n];
            int index = 0;

            // Traverse each diagonal
            for (int d = 0; d < m + n - 1; d++) {
                // If d is even, traverse upwards
                if (d % 2 == 0) {
                    int row = d < m ? d : m - 1;
                    int col = d < m ? 0 : d - m + 1;
                    while (row >= 0 && col < n) {
                        result[index++] = mat[row][col];
                        row--;
                        col++;
                    }
                } else { // If d is odd, traverse downwards
                    int row = d < n ? 0 : d - n + 1;
                    int col = d < n ? d : n - 1;
                    while (row < m && col >= 0) {
                        result[index++] = mat[row][col];
                        row++;
                        col--;
                    }
                }
            }

            return result;
        }
    }

