// Time Complexity : O (m x n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Integer[] result = new Integer[m * n];
        int i = 0, j = 0, k = 0;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while (true) { //break any time top crosses bottom or left crosses right

            // go left to right, topmost available row
            for(j = left; j <= right; j++) {
                result[k++] = matrix[top][j];
            }

            // topmost row done, increment it
            top++;
            if (top > bottom) break;

            // go top to bottom, rightmost available column
            for(i = top; i <= bottom; i++) {
                result[k++] = matrix[i][right];
            }
            // rightmost column done, decrement it
            right--;
            if (left > right) break;

            // go right to left, bottommost available row
            for(j = right; j >= left; j--) {
                result[k++] = matrix[bottom][j];
            }

            // bottommost row done, decrement it
            bottom--;
            if (top > bottom) break;

            // go bottom to top, leftmost available column
            for(i = bottom; i >= top; i--) {
                result[k++] = matrix[i][left];
            }

            // leftmost column done, increment it
            left++;
            if (left > right) break;
        }
        return Arrays.asList(result);
    }
}
