import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0;
        int right = n - 1, bottom = m - 1;

        while (top <= bottom && left <= right) {
            // Move left to right
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++; // Move boundary down

            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // Move boundary left

            // Move right to left (check if still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--; // Move boundary up
            }

            // Move bottom to top (check if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // Move boundary right
            }
        }
        return list;
    }
}
