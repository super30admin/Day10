/*
    LC - 54. Spiral Matrix
    TC - O(m * n)
    SC - O(1)
    Approach -
        Keeping 4 pointers top, bottom, left and right.
        moving the pointer after each direction of traversal.
        Since it is spiral, traversal will be done by
            moving from left to right
            moving from top to bottom
            moving from right to left
            move from bottom to top
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(top <= bottom && left <= right) {
            // move from left to right
            for(int j=left; j<=right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            // move from top to bottom
            for(int j=top; j<=bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;
            // move from right to left
            if(top<=bottom) {
                for(int j=right; j>=left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;           
            }
            // move from bottom to top
            if(left<=right) {
                for(int j=bottom; j>= top; j--) {
                    result.add(matrix[j][left]);
                }
                left++;            
            }
        }
        return result;
    }
}