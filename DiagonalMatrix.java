// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes



class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat == null){
            return new int[] {};
        }
        int index = 0;
        int m = mat.length;
        int n = mat[0].length;
        int dir =  1;
        int[] result = new int[m*n];
        int  row = 0,col =0;
        while(index < m*n){
            result[index] = mat[row][col];
            index++;
            if(dir == 1){
                if(col == n-1){
                    dir = -1;
                    row++;
                }else if(row == 0){
                    dir = -1;
                    col++;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m-1){
                    dir = 1;
                    col++;
                }else if(col == 0){
                    dir = 1;
                    row++;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}