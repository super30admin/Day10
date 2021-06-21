// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        int m = mat.length; int n= mat[0].length;
        int[] result = new int[m*n];
        int dir=1; int r=0; int c=0;
        int i=0;
        while(i < m*n){
            result[i] = mat[r][c];
            if(dir == 1){
                if(c == n-1){
                    r++; dir = -1;
                }
                else if(r==0){
                    c++; dir = -1;
                }else{
                    r--; c++;
                }
            }else{
                if(r == m-1){
                    c++; dir = 1;
                }
                else if(c==0){
                    r++; dir = 1;
                }else{
                    c--; r++;
                }
            }
            i++;
        }
        return result;
    }
}