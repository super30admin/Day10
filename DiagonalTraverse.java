import java.util.Arrays;

// Time Complexity: O(m x n) as m and n are varying lengths and traversing over the new result array is carried
// Space Complexity: O(1) as result array is 1D and expected return type is same. So code expects it. 

// Manipulation of the row and column index along with the direction status makes it easier to traverse elements diagonally.
public class DiagonalTraverse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][] { { 1, 2, 3 } })));
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][] { { 1 }, { 2 }, { 3 } })));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];

        int row = 0;
        int col = 0;
        int direction = 1;
        int index = 0;
        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            if (direction == 1) {
                if (col == n - 1) {
                    row++;
                    direction = -1;
                } else if (row == 0) {
                    col++;
                    direction = -1;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    direction = 1;
                } else if (col == 0) {
                    row++;
                    direction = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
