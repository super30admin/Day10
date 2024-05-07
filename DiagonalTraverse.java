// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Based on direction, upward or downward, traversing the matrix by considering edge cases.
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n= mat[0].length;

        int[] result = new int[m*n];
        boolean dir = true;
        int r=0, c =0;
        for(int i=0;i< m*n;i++) {
            result[i] = mat[r][c];
            //upward direction
            if(dir) {
                if(c == n-1) {
                    r++;
                    dir = false;
                }else if(r ==0) {
                    c++;
                    dir = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                //downward direction
                if(r == m-1){
                    c++;
                    dir= true;
                }else if(c==0){
                    r++;
                    dir = true;
                }else{
                    r++;
                    c--;
                }
            }

        }
        return result;
    }
}