class Solution {
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
          int i = left;  
          // Left to Right
          while(i<=right)
          {
              output.add(matrix[top][i]);
              i++;
          }
          top+=1;
          if(top>bottom)
          {
              //System.out.println("break1");
              break;
          }
          // Top to Bottom
          i = top;
          while(i<=bottom)
          {
              output.add(matrix[i][right]);
              i++;
          }
          right-=1;
          if(right<left)
          {
             // System.out.println("break2");
              break;
          }
          // right to left
          i = right;
          while(i>=left)
          {
            output.add(matrix[bottom][i]);
            i--;
          }
          bottom-=1;
          if(top>bottom)
          {
              //System.out.println("break3");
              break;
          }
          // Bottom to Top
          i = bottom;
          while(i>=top)
          {
              output.add(matrix[i][left]);
              i--;
          }
          left+=1;
          //System.out.println(top+" "+bottom+" "+left+" "+right);
        }
        return output;     
    }

    // private List<Integer> recurseLeftToRight(int top, int bottom, int left, int right)
    // {

    // }

    // private List<Integer> recurseRightToLeft(int top, int bottom, int left, int right)
    // {

    // }

    // private List<Integer> recurseTopToBottom(int top, int bottom, int left, int right)
    // {

    // }

    // private List<Integer> recurseBottomToRight(int top, int bottom, int left, int right)
    // {

    // }

}
