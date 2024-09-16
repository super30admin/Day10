/*
* Approach: considered Edge Case: move right, down, left, up
* rotated through array in the same manner from left to right, and vice versa; top to bottom and vice versa.
* top =0 top row, left =0 left col, right = n-1 last col, bottom = m-1 last row
* Space Complexity: O(1) - No auxiliary space used.
* Time Complexity: O(M*N)
*  */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length ==0) return new ArrayList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0, bottom =m-1, left =0, right =n-1; 
        List<Integer> result = new ArrayList<>();
        
        while(top <= bottom && left <= right)
        {
            //left to right, col changes
            for(int  j= left; j<= right; j++)
            {
                result.add(matrix[top][j]);
            }top++;
            
            //top to bottom at right col, row changes
            for(int i =top; i<= bottom; i++)
            {
                result.add(matrix[i][right]);
            }right--;
            
            //right to left, col changes
            for(int j = right; j>= left && top <= bottom; j--)
            {
                result.add(matrix[bottom][j]);
            }bottom--;
            
            //bottom to top, row changes
            for(int i= bottom; i>= top && left<= right; i--)
            {
                result.add(matrix[i][left]);
            }left++;
        }
    return result;
        
    }
}
