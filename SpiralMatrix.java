// Time Complexity :  O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null){
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int bottom = m-1;
        int right = n-1;
        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){
            // left to right
            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;


            // right to  left
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }

}