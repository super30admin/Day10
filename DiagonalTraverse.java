// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean goingDown = false;
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        int[] result = new int[m*n];
        int i = 0;
        int j = 0;
        while(count < m*n){
            //System.out.println(mat[i][j]);
            if(goingDown){
                result[count] = mat[i][j];
                i++;j--;count++;
                if(j<0 && i==m){
                    j+=2;
                    i--;
                    goingDown = false;
                }if(j<0){
                    j++;
                    goingDown = false;
                }else if(i==m){
                    i--;
                    j+=2;
                    goingDown = false;
                }
            }else{
                result[count] = mat[i][j];
                j++;i--;count++;
                if(i<0 && j == n){
                    i++;
                    i++;
                    j--;
                    goingDown = true;
                }else if(i<0){
                    i++;
                    goingDown = true;
                }else if(j==n){
                    i++;
                    i++;
                    j--;
                    goingDown = true;
                }
            }
        }
        return result;
    }
}
