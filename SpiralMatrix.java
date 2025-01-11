import java.util.ArrayList;
import java.util.List;

// Time Complexity: O(mxn) as row and column lengths are different
// Space Complexity: O(1) as the method expect to use and return List<Integer>
public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrderClock(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })); // 1,2,3,6,9,8,7,4,5
        System.out.println(spiralOrderClock(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } })); // 1,2,3,4,8,12,11,10,9,5,6,7
        System.out.println(spiralOrderClock(new int[][] { { 1, 2, 3, 4 } })); // 1,2,3,4
        System.out.println(spiralOrderClock(new int[][] { { 1 }, { 2 }, { 3 }, { 4 } })); // 1,2,3,4
        System.out.println();
        System.out.println(spiralOrderAntiClock(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })); // 1,4,7,8,9,6,3,2,5
        System.out.println(
                spiralOrderAntiClock(
                        new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } })); // 1,5,9,13,14,15,16,12,8,4,3,2,6,10,11,7
        System.out.println(spiralOrderAntiClock(new int[][] { { 1, 2, 3, 4 } })); // 1,2,3,4
        System.out.println(spiralOrderAntiClock(new int[][] { { 1 }, { 2 }, { 3 }, { 4 } })); // 1,2,3,4
    }

    private static List<Integer> spiralOrderClock(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }

    private static List<Integer> spiralOrderAntiClock(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][left]);
            }
            left++;

            for (int i = left; i <= right; i++) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][right]);
                }
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[top][i]);
                }
            }
            top++;

        }
        return result;
    }
}