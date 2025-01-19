import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0;

        // Iterate through diagonals
        for (int d = 0; d < m + n - 1; d++) {
            List<Integer> diagonal = new ArrayList<>();

            // Determine start of the diagonal
            int r = d < n ? 0 : d - n + 1;
            int c = d < n ? d : n - 1;

            // Collect diagonal elements
            while (r < m && c >= 0) {
                diagonal.add(matrix[r][c]);
                r++;
                c--;
            }

            // Reverse the diagonal if going up
            if (d % 2 == 0) {
                for (int i = diagonal.size() - 1; i >= 0; i--) {
                    result[index++] = diagonal.get(i);
                }
            } else {
                for (int num : diagonal) {
                    result[index++] = num;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] result = findDiagonalOrder(matrix);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
