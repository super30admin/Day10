package spiralMatrix;

// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.ArrayList;
import java.util.List;

public class Recursive {

    public static void main(String[] args) {

//        int[][] matrix = {{1,2, 3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        helper(matrix, result, top, right, left, bottom);

        return result;
    }

    private static void helper(int[][] matrix, List<Integer> result, int top, int right, int left, int bottom) {

        if (top > bottom || left > right) return;

        // top
        for (int j = left; j <= right; j++) {
            result.add(matrix[top][j]);
        }
        top++;

        // right
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }
        right--;

        if (top <= bottom) {
            // bottom
            for (int j = right; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
        }
        if (left <= right) {
            // left
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        helper(matrix, result, top, right, left, bottom);

    }

}
