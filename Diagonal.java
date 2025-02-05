class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //Time Complexity: O(m * n) 
        //Space Complexity: O(1)
         if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, dir = 1; // dir = 1 (upward), dir = -1 (downward)

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            // Moving upward
            if (dir == 1) {
                if (col == n - 1) { // Reached last column
                    row++;
                    dir = -1;
                } else if (row == 0) { // Reached first row
                    col++;
                    dir = -1;
                } else { // Normal diagonal movement
                    row--;
                    col++;
                }
            } 
            // Moving downward
            else {
                if (row == m - 1) { // Reached last row
                    col++;
                    dir = 1;
                } else if (col == 0) { // Reached first column
                    row++;
                    dir = 1;
                } else { // Normal diagonal movement
                    row++;
                    col--;
                }
            }
        }
        return result;
        
    }
}