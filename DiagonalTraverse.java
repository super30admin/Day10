//The approach here is to traverse the matrix by considering two constraints top and right when traversing up, and two constraints left and bottom when traversing down
//Time Complexity: O(m*n)
//Space Complexity: Auxiliary O(1) using no extra space
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int[m*n];
        if(matrix == null) return result;
        boolean flag = true;
        int i =0; int j = 0; int k = 0;
        while(k<m*n){//condition to check 
            result[k] = matrix[i][j];
            k++;
            //go up
            if(flag){
                if(j == n-1){
                    i = i+1;
                    flag = false;
                } else if(i == 0){
                    j = j+1;
                    flag = false;
                } else{     
                    i = i-1;
                    j = j+1;
                }
            }
            //go down
            else {
                if(i == m-1){
                    j = j+1;
                    flag = true;
                } else if(j == 0){
                    i = i+1;
                    flag = true;
                }
                else{
                    i = i+1;
                    j = j-1;
                }
            }  
        }
        return result;
    }
}