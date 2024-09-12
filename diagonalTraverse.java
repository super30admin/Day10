//time complexity O(m x n)
//space complexity O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length; int n = matrix[0].length;
        int[] result = new int[m * n];
        int i = 0;
        int r = 0;
        int c = 0;
        int dir = 1;
        while(i < m * n){
            result[i] = matrix[r][c];
            //upward direction
            if(dir == 1){
                //edge case
                if(c == n-1){
                    r++; dir = -1;
                } else if(r == 0){//edge case
                    c++; dir = -1;
                }
                else{//regular case
                    r--; c++;
                }
            } else {//downward direction
                //edge case
                if(r == m-1){
                    c++; dir = 1;
                //edge case
                } else if(c == 0){
                    r++; dir = 1;
                //regular case
                } else{
                    r++; c--;
                }
            }
            i++;
        }
        return result;
    }
}
