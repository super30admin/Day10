//TC: O(m*n)
//SC : O(m*n)

class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int dir = 1;
        int index = 0;
        int row = 0;
        int col = 0;
        //1 -> bottom to top
        //-1 -> top to bottom
        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
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

            } else if (dir == -1) {
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    col--;
                    row++;
                }
            }
        }
        return result;
    }
}