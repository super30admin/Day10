class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat.length; //rows
        int n = mat[0].length; //cols
        int arrLength = m * n;
        int[] arr = new int[arrLength];

        int i = 0;
        int dir = 1;
        int col = 0;
        int row = 0;
        while(i < (m * n)) {
            if(row >= 0 && col >= 0 && row < m && col < n) {
               arr[i++] = mat[row][col];
            }
            if(dir == 1) {
                if(col == n - 1) {
                    dir = -1;
                    row++;
                } else if(row == 0) {
                    dir = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == m - 1) {
                    col++;
                    dir = 1;
                } else if(col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}
