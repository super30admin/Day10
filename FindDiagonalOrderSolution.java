class FindDiagonalOrderSolution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean bottomToTop = true;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int row = 0, col = 0;
        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            if (bottomToTop) {
                if (col == n - 1) {
                    bottomToTop = false;
                    row++;
                } else if (row == 0) {
                    bottomToTop = false;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    bottomToTop = true;
                    col++;
                } else if (col == 0) {
                    bottomToTop = true;
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