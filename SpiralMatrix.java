class Solution {
    //Time Complexity: O(m * n)
    //Space Complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++; // Move the top boundary down

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--; // Move the right boundary left

            // Traverse from right to left (if still within valid bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top (if still within valid bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++; // Move the left boundary right
            }
        }
        return result; 
    }
}