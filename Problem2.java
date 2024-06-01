/*
    LC - 498. Diagonal Traverse
    TC - O(m * n)
    SC - O(1)
    Approach - 
        Using direction, check the boundary condition and traverse the element.
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int row = 0, col = 0;
        int dir = 1;
        // 1 means bottom to top, where as -1 means top to bottom.
        while(index < m * n) {
            result[index] = mat[row][col];
            index++;
            if(dir == 1) {
                if(col == n-1) {
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
                if(row == m-1) {
                    dir = 1;
                    col++;
                } else if(col == 0) {
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