class Solution {
    //tc- o(m*n)
    //sc-o(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        
        while(left<=right&&top<=bottom)
        {
            //top wall
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[top][j]);
                
            }
            top++;
            //right wall
            
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            
            }
            right--;
            //bottom wall
            if(left<=right&&top<=bottom)
            {
            for(int j=right;j>=left;j--)
            {
                result.add(matrix[bottom][j]);
            }
            }
            bottom--;
            //left wall;
            if(left<=right&&top<=bottom)
            {
            for(int i=bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            }
            left++;
        }
        return result;
        
    }
}