//TC: O(m*n)
//SC: O(1)
//approach: maintaining top, bottom, left, right to check boundary conditions for spiral traversal

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int l = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        if (l == 1) {
            result.add(matrix[0][0]);
            return result;
        }
        if (matrix.length == 1) {
            for (int i = 0; i < l; i++) {
                result.add(matrix[0][i]);
            }
            return result;
        }
        if (matrix[0].length == 1) {
            for (int i = 0; i < l; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right && result.size() < l) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) return result;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (right < left) return result;

            for (int i = right; i>= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (bottom < top) return result;

            for (int i = bottom; i>= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }
}
