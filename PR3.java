//TC: O(m*n)
//SC: O(1)

class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<Integer>();
        int m = matrix.length;
        int n= matrix[0].length;
        int top=0;
        int bottom=m-1;
        int right=n-1;
        int left=0;


        while(top<=bottom && left<=right){
        //left to right
        for(int i=left;i<=right;i++)
        {
             result.add(matrix[top][i]);
             
        }
         top++;

        //top to bottom
        for(int i=top;i<=bottom;i++)
        {
             result.add(matrix[i][right]);
             
        }
       right--;

       if(top<=bottom){
        //right to left
        for(int i=right;i>=left;i--)
        {
             result.add(matrix[bottom][i]);
            
        }
         bottom--;
       }

        if(left<=right){
        //bottom to top
        for(int i=bottom;i>=top;i--)
        {
             result.add(matrix[i][left]);
            
        }
         left++;
        }
        }
        return result;
    }
}