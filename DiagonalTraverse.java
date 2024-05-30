class DiagonalTraverse {

    //TC - O(m*n), SC - O(1)
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[]{};

        int m = mat.length;
        int n = mat[0].length;

        int[] diagonalOrder = new int[m*n];

        //dir = 1 - bottom to top
        //dir = -1 - top to bottom
        int dir =1;
        int row =0;
        int col =0;
        int index =0;

        while(row >=0 && row < m && col >=0 && col < n) {
            diagonalOrder[index++] = mat[row][col];
            if(dir == 1) {
                if(col == n-1) {
                    dir = -1;
                    row++;
                }

                else if(row == 0) {
                    dir = -1;
                    col++;
                }

                else {
                    row--;
                    col++;
                }

            }

            else {
                if(dir == -1) {

                    if(row == m-1) {
                        dir = 1;
                        col++;
                    }

                    else if(col == 0) {
                        dir = 1;
                        row++;
                    }

                    else {
                        row++;
                        col--;
                    }
                }

            }
        }

        return diagonalOrder;

    }
}