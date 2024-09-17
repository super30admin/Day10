//Time Complexity: O(mn)
//Space Complexity: O(1) - not considering the result list
//LeetCode: Yes

//Mark the boundaries. 
//Increment and decrement the rows and columns based on the cases. 

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null) return new int[] {-1};
        
        
        int m = matrix.length; // row length
        int n = matrix[0].length; // column length
        
        int [] result = new int[m*n];
        
        
        int flip = 1; //up = 1 down = -1
        int r =0, c=0; // rows and columns 
        int i = 0; //to traverse in the result list 

        while(i<m*n){
            result[i] = matrix[r][c]; // values assigned as we traverse the matrix
            
            if(flip == 1){
                //case top row while going up
                if(r ==0){
                    c++;
                    flip = -1;
                }
                //last column while going up
                else if(c == n-1) {
                    r++;
                    flip = -1;

                } else{
                    r--;
                    c++;
                }
                
            } else{
                if(c == 0){
                    r++;
                    flip =1;
                }
                else if(r == m -1) {
                    c++;
                    flip = 1;
                } else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
        
    }
}