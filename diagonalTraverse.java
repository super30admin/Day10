/*
we will 2 cases going top right direction up
going bottom left direction down

TC --> O(n*m)
SC --> O(1)
 */
class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        int ROW = mat.length;
        int COL = mat[0].length;
        int[] res = new int[ROW * COL];
        //case 1 going top right
        int idx = 0;
        int row = 0;
        int col = 0;
        int dir = 1;
        while (idx < ROW * COL) {
            res[idx] = mat[row][col];
            idx++;
            //case 1 going up
            if (dir == 1) {
                if (col == COL - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }

            } //case 2 when going down
            else {

                if (row == ROW - 1) {
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

        }//while

        return res;

    }//mwthod
}
