// Time Complexity :O(M*N), M is the no of rows, N is the no of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultArr = new ArrayList<>();
        int noOfRows = matrix.length;
        int noOfColumns = matrix[0].length;

        int top=0, bottom = noOfRows-1, left = 0, right = noOfColumns-1;
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                resultArr.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i <= bottom; i++) {
                resultArr.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    resultArr.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    resultArr.add(matrix[i][left]);
                }
            }
            left++;
        }
        return resultArr;
    }
}