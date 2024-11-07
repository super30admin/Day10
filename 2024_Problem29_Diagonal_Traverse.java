//498. Diagonal Traverse - https://leetcode.com/problems/diagonal-traverse/description/
//Time Complexity: O(m*n)
//Space Complexity: O(n)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //base case
        if(mat == null || mat.length == 0){
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int i = 0; int r = 0; int c = 0; int dir = 1;
        int[] result = new int[m*n];
        while(i < m*n){
            result[i] = mat[r][c];
            if(dir == 1){ //direction = +1
                if(c == n-1){
                    r++; dir = -1;
                } else if(r == 0){
                    c++; dir = -1;
                } else {
                    r--; c++;
                }
            } else { //direction = -1
                if(r == m-1){
                    c++; dir = 1;
                } else if(c == 0){
                    r++; dir = 1;
                } else {
                    r++; c--;
                }
            }
            i++;
        }
        return result;
    }
}