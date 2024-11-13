
// Time Complexity : 0(m*n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int top = 0, down = m - 1, right = n - 1, left = 0;
        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            if (top <= down) {

                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right)
                for (int i = down; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            left++;
        }
        return result;
    }
}


