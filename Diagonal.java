// Overall Time Complexity : O(m*n) . The n time taken to traverse all the elements
// Overall Space Complexity : O(1) . There is no extra space taken for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// Initialize variables: m, n for matrix dimensions, and res for storing results.
// Traverse the matrix in diagonal order using two pointers (i, j) and a direction flag.
// Move up-right (diagonal up) or down-left (diagonal down) based on the direction.
// Return the result array containing the diagonally traversed elements.


public class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[m*n];
       
        boolean dir = true;
        int idx = 0;
        int i = 0;
        int j = 0;
        while(idx < m*n){
            res[idx] = mat[i][j];
            idx++;
            if(dir){

                //up
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
            }
            else{
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
return res;
}
}
