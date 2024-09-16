class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }
        int r, c, i, m, n, dir;
        m = mat.length;
        n = mat[0].length;
        int[] res = new int[m * n];
        i = 0;
        r = 0;
        c = 0;
        dir = 1;
        while (i < m * n) {
            res[i] = mat[r][c];
            if(dir == 1) {
                if(c == n - 1) {
                    dir = -1;
                    r++;
                } else if(r == 0) {
                    dir = -1;
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m - 1) {
                    dir = 1;
                    c++;
                } else if(c == 0) {
                    dir = 1;
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return res;
    }
}