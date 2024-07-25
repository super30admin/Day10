/**
*  space complexity: O(M*N)
  */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right =  n -1;
        int top =0;
        int bottom = m-1;
        List<Integer> output = new ArrayList<>();

        while(left<= right && top <= bottom) {

            for(int i=left; i<=right; i++) {
                output.add(matrix[top][i]);
            }
            top++;

            for(int j=top; j<= bottom; j++ ) {
                output.add(matrix[j][right]);
            }
            right--;

            if(output.size() == m*n) break;

            for(int i = right; i>=left; i--) {
                output.add(matrix[bottom][i]);
            }
            bottom--;

            for(int j = bottom; j>=top; j--) {
                output.add(matrix[j][left]);
            }
            left++;


        }
        return output;
    }
}
