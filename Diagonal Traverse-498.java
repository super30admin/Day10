class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

//Time Complexity: O(m*n) where m is number of rows and n is number of columns
//Space Complexity: O(1) constant space 
//Base case: When array is null or empty return empty result
        if(mat.length==0 || mat==null)
        {
            return new int[]{};
        }
        // number of rows
        int m = mat.length;
        // number of columns
        int n = mat[0].length;
        //int traversing the rows
        int r =0;
        //int traversing the columns
        int c = 0; 
        int index = 0;
        // Tp keep check of directions
        // 1 means botton to top
        // -1 means top to bottom
        int dir = 1;
        // Result array
        int[] result = new int[m*n];
        // index to insert in array
        while(index < m*n)
        {
            // System.out.println(index);
            result[index] = mat[r][c];
            // index to iterate the result array
            index +=1;
            // If we are going bottom to top
            if(dir==1)
            {
              if(c==n-1) // When we reach the end of column the direction changes
              {
                dir = -1;
                 r++;
              }
              else if(r==0) // If the element is at first row, move to next column & change the direction
              {
                  dir=-1;
               c++;
              }
              // In generla scenario
              else {
                  r--;
                  c++;
              }
            }
             // If we are going top to bottom 
            else {
                 if (r==m-1) // If last row then move one column forward and change direction
                { 
                    dir = 1;
                   c++;
                   
                } 
                else if(c==0)// If we are in first column then change the direction and move to netx row
                {
                  dir=1;
                  r++;
                }
                // In general scenario
                else {
                  r++;
                  c--;
                }
            }
        }
        return result;     
    }
}
