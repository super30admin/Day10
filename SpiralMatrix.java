// TC: O(m*n) m = no. of rows, n=no. of columns
// SC: O(1) No auxiliary space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}