/*
Time Complexity: O(m*n) spiral traversal

Space Complexity: O(1) no extra space is used

Did this code successfully run on Leetcode : Yes
 */
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n];
        boolean dir = true; //direction = true meaning travelling upward else downward
        int row = 0, col = 0;

        for(int i = 0; i<m*n; i++)
        {
            result[i] = mat[row][col];

            if(dir)
            {
                if(row == 0 && col != n-1) {
                    //Go to the next column and then change the direction to downward
                    col++;
                    dir = false;
                }
                else if(col == n-1) {
                    row++;
                    dir = false;
                }
                else {
                    row--; col++;
                }
            }
            else //downward direction
            {
                if(col==0 && row !=m-1) {
                    //Go to the next row and then change the direction to upward
                    row++;
                    dir = true;
                }
                else if(row == m-1) {
                    col++;
                    dir = true;
                }
                else {
                    row++; col--;
                }
            }
        }

        return result;
    }
}