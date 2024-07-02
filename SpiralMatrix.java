//Time Complexity : O(M*N)
//Space Complexity : O(M*N)
//Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We maintain four pointers for four directions and keep increasing
// or decreasing them basis the condition

// Your code here along with comments explaining your approach
public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {

            int m = matrix.length; // length of row
            int n = matrix[0].length; // length of coloumn
            List<Integer> res = new ArrayList<>();
            int top = 0;
            int bottom = m - 1;
            int left = 0;
            int right = n - 1;

            while (top <= bottom && left <= right) {

                if (top <= bottom) { // top row
                    for (int i = left; i <= right; i++) {
                        res.add(matrix[top][i]);
                    }
                    top++;
                }

                if (left <= right) { // right coloumn
                    for (int i = top; i <= bottom; i++) {
                        res.add(matrix[i][right]);
                    }
                    right--;
                }

                if (top <= bottom) { // bottom row
                    for (int i = right; i >= left; i--) {
                        res.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) { // left coloumn
                    for (int i = bottom; i >= top; i--) {
                        res.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return res;
        }

}