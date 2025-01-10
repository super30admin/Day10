import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity: O(m*n) = all the elements in matrix
 * Space Complexity: O(1) result array is returned
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 *
 * Travel in this order and add items to list:
 * 1. left to right and then increase top to next row
 * 2. top to bottom and then decrease right to column before current
 * 3. right to left and then decrease bottom to row before current
 * 4. bottom to top and then increase left to next column
 * 5. Return the result
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--;

            // Traverse right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix obj = new SpiralMatrix();
        int[][] matrix = {
                {1,2,3,4,5},
                {3,4,5,6,7},
                {9,8,7,6,5}
        };
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println("Result: " + result);
    }
}
