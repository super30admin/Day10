// Problem 498. Diagonal Traverse
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        boolean flag = true; // up
        for(int i=0; i < result.length; i++){
            result[i] = mat[r][c];
            if(flag){
                if(r == 0 && c!=n-1){
                    c++;
                    flag=false;
                }else if(c == n-1){
                    r++;
                    flag=false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(c == 0 && r!=m-1){
                    r++;
                    flag=true;
                }else if(r == m-1){
                    c++;
                    flag=true;
                }else{
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
}
