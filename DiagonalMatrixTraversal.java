
/**

 Approach: Matrix traversal diagonally

 Working:
     for each iteration
         traverse diagonally from bottom to top direction 1
         or traverse diagonally from top to bottom direction -1


 Time Complexity: O(m*n)
 Space Complexity: O(1) // since the method requires to return an 1d of matrix elements, its constat
 */

class DiagonalMatrixTraversal {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int row = 0 ,col = 0, index = 0;
        int dir =1;

        while(index<m*n) {
            result[index] = mat[row][col];
            index++;

            //bottom to top
            if(dir == 1) {

                //col max index limit reached
                if(col == n-1) {
                    dir = -1;
                    row++;
                }
                else if(row == 0) { // row min index limit reached
                    dir = -1;
                    col++;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {
                //direction -1
                //top to bottom
                if(row == m-1) {
                    dir = 1;
                    col++;
                }
                else if(col == 0){
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
