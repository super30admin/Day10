// Time Complexity : O(m*n)
// Space Complexity : O(1), no extra space required
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0; int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        while(top <= bottom && left <=right){

            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;

           // if(top <= bottom && left<= right){// not reuired as we are cheking top and bottom
               for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                } 

                right--;
            //}

            if(top <=bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
        
    }
}