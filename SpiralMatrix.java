import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> result = new ArrayList<>();

        // Initialize boundaries
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {

            //left to right
            for (int i = left; i <= right; ++i) {
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }
            right--;

            // right to left 
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top 
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}