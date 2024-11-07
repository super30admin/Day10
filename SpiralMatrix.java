// Approach : Using boundaries
// Time : O(m*n)
// Space: O(m*n)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result = new ArrayList<>();
        // Base case
        if(matrix == null || matrix.length == 0) return result;
        
        int top = 0;
        int left = 0;

        int right = matrix[0].length -1;
        int bottom = matrix.length-1;

        while(left<=right && top <=bottom){
            // left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            // right to bottom  
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                // right to left
               for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                } 
            }
            bottom--;
            if(left <= right){
                // bottom to top
                for(int i = bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
        
    }
}