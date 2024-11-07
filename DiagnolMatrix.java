// Time Complexity: O(M×N), since each element is visited once.
//Space Complexity: O(1), excluding the output array which is required for the result.
// run on leetcode : Yes
// Any problems faced: No
public class DiagnolMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int M = matrix.length;
        int N = matrix[0].length;
        int[] result = new int[M * N];
        boolean direction = true;  // true means moving upwards, false means moving downwards

        int row = 0, col = 0;

        for (int index = 0; index < M * N; index++) {
            result[index] = matrix[row][col];

            if (direction) {  // Moving upwards
                if (col == N - 1) {      // Hit the last column, move down to next row
                    row++;
                    direction = false;
                } else if (row == 0) {   // Hit the first row, move to next column
                    col++;
                    direction = false;
                } else {                 // Move up-right
                    row--;
                    col++;
                }
            } else {  // Moving downwards
                if (row == M - 1) {      // Hit the last row, move to the next column
                    col++;
                    direction = true;
                } else if (col == 0) {   // Hit the first column, move to the next row
                    row++;
                    direction = true;
                } else {                 // Move down-left
                    row++;
                    col--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        DiagnolMatrix sol = new DiagnolMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = sol.findDiagonalOrder(matrix);

        // Print the result array
        System.out.print("Output: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

