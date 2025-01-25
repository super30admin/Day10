/*
Traverse the matrix diagonally, alternating between upward and downward directions.
When moving upward (dir == 1), the traversal continues until the top row or the
last column is reached, at which point the direction switches to downward (dir == -1).
Similarly, while moving downward, the traversal continues until the bottom row or the
first column is reached, and the direction switches back to upward.
T.C = O(m*n)
S.C = O(1)
*/

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat.length == 0 || mat == null)
        {
            return new int[]{};
        }

        int row = 0;
        int col = 0;

        //number of rows
        int m = mat.length;
        //number of columns
        int n = mat[0].length;

        int[] result = new int[m * n];

        //direction
        int dir = 1;

        int index = 0;

        while(index < m * n)
        {
            result[index] = mat[row][col];
            index++;

            //direction = 1

            if(dir==1)
            {
                if(col==n-1)
                {
                    dir = -1;
                    row++;
                }

                else if(row==0)
                {
                    dir = -1;
                    col++;
                }
                else
                {
                    row--;
                    col++;
                }
            }

            //direction = -1
            else
            {

                if(row==m-1)
                {
                    dir = 1;
                    col++;
                }
                else if(col==0)
                {
                    dir = 1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
