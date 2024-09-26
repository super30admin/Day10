class Solution {
    // Time Complexity: O(m*n) where m is number of rows and n is number of columns
    // Space Complexity: O(1) where space is constant
    public List<Integer> spiralOrder(int[][] matrix) {
        // if matrix is null or empty return empty matrix
        if(matrix==null || matrix.length==0)

        {
            return new ArrayList<Integer>();
        }

// Output ArrayList
        List<Integer> output = new ArrayList<Integer>();
        int top = 0; // first row of matrix
        int bottom = matrix.length-1; // last row of matrix
        int left = 0; // first column of matrix
        int right = matrix[0].length-1; // last column of matrix
        while(top<=bottom && left<=right)
        {
          // Left to Right
          for(int i =left; i<=right;i++)
          {
              output.add(matrix[top][i]);
          }
          
          top+=1;
          // Top to Bottom
          for(int i =top;i<=bottom;i++)
          {
              output.add(matrix[i][right]);
          }
          right-=1;
          // right to left
          if(top<=bottom)
          {
          for(int i = right;i>=left;i--)
          {
            output.add(matrix[bottom][i]);
          }
          }
          bottom-=1;
          // Bottom to Top
          if(left<=right)
          {
          for(int i = bottom; i>=top;i--)
          {
              output.add(matrix[i][left]);
          }
          }
          left+=1;
        }
        return output;     
    }

}
