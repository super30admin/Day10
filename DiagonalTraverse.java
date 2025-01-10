import java.util.Arrays;

/**
 * Time complexity: O(m*n); m is rows and n is columns
 * Space complexity: O(1) the output array is returned
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 *
 * Traversal is based on direction of diagonal,
 * Index row + column determines which direction of diagonal we are on.
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int r = 0;
        int c = 0;
        int rows = mat.length;
        int columns = mat[0].length;

        // create a new array with m*n size
        int[] result = new int[rows * columns];

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];
            // if sum is even - going up
            if ((r + c) % 2 == 0) {
                if (c == columns - 1) {
                    r++;
                } else if (r == 0) {
                    // first row, then move to adjacent column
                    c++;
                } else {
                    // middle indexes - go up diagonally
                    r--;
                    c++;
                }
            } else {
                // if sum is odd - going down
                if (r == rows - 1) {
                    c++;
                } else if (c == 0) {
                    // first column, then move to row below this one
                    r++;
                } else {
                    // middle indexes - go down diagonally
                    r++;
                    c--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DiagonalTraverse obj = new DiagonalTraverse();
        int[][] mat = {
                {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}
        };
        int[] diagonalOrder = obj.findDiagonalOrder(mat);
        System.out.println("Result: " + Arrays.toString(diagonalOrder));
    }
}
