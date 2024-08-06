// TC: O(m*n) m = no. of rows, n=no. of columns
// SC: O(1) No auxiliary space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class DiagnolTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];
        int row = 0;
        int col = 0;
        boolean direction = true;
        for(int i = 0;i<result.length;i++) {
            result[i] = mat[row][col];
            if(direction) {
                if(row==0 && col!= n-1) {
                    col ++;
                    direction = false;
                } else if(col == n-1) {
                    row++;
                    direction = false;
                } else{
                    row -- ; col++;
                }
            } else{
                if(col==0 && row!=m-1) {
                    row++;
                    direction = true;
                } else if(row==m-1) {
                    col ++;
                    direction = true;
                } else {
                    row++; col--;
                }
            }
        }
        return result;
    }
}