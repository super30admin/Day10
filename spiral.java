// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: For this solution, we have 4 variables - top, bottom, left, right. We carefully
// traverse through the entire matrix by changing the values everytime we come to the end of that variable.



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null && matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int right = n - 1;
        int bottom = m - 1;
        while (top <= bottom && left <= right) {
            // moving left to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            // moving top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                // moving right to left
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // moving bottom to top
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}