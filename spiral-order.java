// TC = O(m * n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // null
        if(matrix == null || matrix.length == 0) return new ArrayList<Integer>();
        int m = matrix.length, n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while(left <= right && top <= bottom) {
            // top row
            for(int j = left; j <= right; j++) result.add(matrix[top][j]);
            top++;
            // right col
            if(left <= right && top <= bottom) {
                for(int i = top; i <= bottom; i++) result.add(matrix[i][right]);
                right--;
            }
            // bottom row
            if(left <= right && top <= bottom) {
                for(int j = right; j >= left; j--) result.add(matrix[bottom][j]);
                bottom--;
            }
            // left col
            if(left <= right && top <= bottom) {
                for(int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
}