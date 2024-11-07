// Approach : Traversing entire matrix;
// Time : O(m*n)
// Space: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // edge case
        if(mat == null || mat.length==0) return  new int[0];

        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];

        // initialize where we are in mat
        int r = 0;
        int c = 0 ;

        int i = 0;
        int dir = 1; // up

        while(i < m*n ){
            result[i]= mat[r][c]; // add first element to result

            if(dir == 1){
                // going up
                if(c == n-1){
                    r++;
                    dir=0;
                } else if (r == 0){
                    c++;
                    dir=0;
                } else{
                    // diagonal up
                    r--;
                    c++;
                }
            } 
            else {
                // going down
                if(r == m-1){
                    c++;
                    dir=1;
                } else if(c == 0){
                    r++;
                    dir=1;
                } else {
                    // diagonal down
                    r++;
                    c--;
                }

            }
            i++;
        }
        return result;
    }
}