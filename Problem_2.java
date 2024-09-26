/*

Problem 2 : Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal 
order as shown in the below image.

Time Complexity : O(n*m)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes


*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat == null || mat.length == 0){
            return new int[]{};
        }

        int n = mat.length;
        int m = mat[0].length;
        int r = 0;
        int c = 0;
        int index = 0;
        int dir = 1;
        int[] res = new int[m * n];
        while(index < res.length){

            res[index] = mat[r][c];
            index++;
            if(dir == 1){
                if(c == m-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir=-1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == n-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        
        return res;
    }
}