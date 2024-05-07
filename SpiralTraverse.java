// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top=0, bottom=m-1, left=0, right=n-1;

        while(top <= bottom && left <= right) {
            for(int j=left;j<=right;j++) {
                result.add(matrix[top][j]);
            }
            top++;
            if(top <= bottom && left <= right) {
                for(int j=top;j<=bottom;j++) {
                    result.add(matrix[j][right]);
                }
            }
            right--;
            if(top <= bottom && left <= right) {
                for(int j=right;j>=left;j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(top <= bottom && left <= right){
                for(int j=bottom;j>=top;j--) {
                    result.add(matrix[j][left]);
                }
            }
            left++;
        }
        return result;
    }
}