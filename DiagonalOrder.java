// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[n * m];
        int row = 0, col = 0;
        int d = 1;  // Direction indicator: 1 for upward, -1 for downward

        for (int i = 0; i < n * m; i++) {
            result[i] = mat[row][col];

            // Moving upwards
            if (d == 1) {
                if (col == m - 1) {  // Reached the right boundary
                    row++;
                    d = -1;
                } else if (row == 0) {  // Reached the top boundary
                    col++;
                    d = -1;
                } else {  // Move diagonally up
                    row--;
                    col++;
                }
            } 
            // Moving downwards
            else {
                if (row == n - 1) {  // Reached the bottom boundary
                    col++;
                    d = 1;
                } else if (col == 0) {  // Reached the left boundary
                    row++;
                    d = 1;
                } else {  // Move diagonally down
                    row++;
                    col--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DiagonalOrder solution = new DiagonalOrder();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] result = solution.findDiagonalOrder(mat);

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
