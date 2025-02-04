class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int[m*n];
        int idx = 0;
        boolean dir = true;
        if(matrix == null) return result;
        int i=0; int j=0;
        while(idx<m*n){
            result[idx] = matrix[i][j];
            idx++;
            //up
            if(dir){
                if(j==n-1){
                i++;
                dir = false;
            }else if(i==0){
                j++;
                dir = false;

            }else{
                i--;
                j++;
            }
            }else{
                 // down
            if(i==m-1){
                j++;
                dir = true;
            }else if(j==0){
                i++;
                dir = true;
            }else{
                i++;
                j--;
             }
            }
        }
        return result;
    }
}