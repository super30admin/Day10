class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        //o(1) space and o(m * n) time
        if (matrix == null || matrix.length == 0) return new int[0];
        int r =0; int c = 0; int direction = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int result = new int[m * n];
        while (i < m * n) {
            result[i] = matrix[r][c];
            if (direction == 1) {
                if (c==n-1) {
                    r++;
                    direction = -1;
                } else if (r == 0) {
                    c++;
                    direction = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r==m-1) {
                    c++;
                    direction = 1;
                } else if (c == 0) {
                    r++;
                    direction = 1;
                } else {
                    c--;
                    r++;
                }
            }
            i++;
        }

        return result;

    }
}