// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;

        int top = 0;
        int left = 0;
        int right = m-1;
        int bottom = n-1;

        while(top<=bottom && left<=right){
            //move left to right
            for(int j =left; j<=right; j++){
                res.add(matrix[top][j]);
            }
            top++;

            // move top to bottom
                for(int i=top; i<=bottom; i++){
                    res.add(matrix[i][right]);
                }
            right --;

            //move right to left
            if(top<=bottom){
                for(int j= right; j>=left; j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            //move bottom to top
            if(left <= right)
            {
                for(int i = bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}