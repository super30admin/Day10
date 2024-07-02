import java.util.Arrays;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Use two conditions for directions up and down for traversing the matrix. Handle edge cases for individual directions
such as first and/or last row and/or column. Move row and col pointers accordingly to the next index.
 */

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean direction = true;
        int index = 1;
        int row = 0;
        int col = 0;
        int[] res = new int[m*n];
        res[0] = mat[0][0]; // Setting first element by default

        while(index < m*n) { //O(m*n) T.C
            //up
            if(direction) {
                if (col == n - 1) { //last column
                    row++;
                    direction = false; //go down
                } else if (row == 0) { //first row
                    col++;
                    direction = false; //go down
                } else { //regular
                    row--;
                    col++;
                }
            }

            //down
            else {
                if (row == m - 1) { //last row
                    col++;
                    direction = true; //go up
                } else if (col == 0) { //first column
                    row++;
                    direction = true; //go up
                } else { //regular
                    row++;
                    col--;
                }
            }
            res[index] = mat[row][col]; //O(1) because result array is not auxiliary space.
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The diagonal traversed array for the given matrix is " +
                Arrays.toString(findDiagonalOrder(mat)));
    }
}