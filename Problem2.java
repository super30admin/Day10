/*
Time COmplexity -> O(N)
Space COmplexity -> O(1)
*/

class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if (dir == 1) {
                if (col == n - 1) {
                    dir = -1;
                    row++;
                } else if (row == 0) {
                    dir = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    dir = 1;
                    col++;
                } else if (col == 0) {
                    dir = 1;
                    row++;
                } else {
                    row++;
                    col--;
                }
            }

        }
        return result;
    }

}