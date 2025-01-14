// Time Complexity : O(m*n)
// Space Complexity :O(m*n) space for storage
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with commaents explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;

        boolean flag = true; // upward direction

        for(int i = 0; i < result.length; i++){
            result[i] = mat[r][c];
            //Go to next element, when going to next elemt, check the direction, so now comes the flag

            if(flag){
                /* Note : when moving up, onwards we are going out of bounds at 
                1: row = 0
                2: last col*/
                if(r == 0 && c != n-1){
                    flag = false;
                    c++;
                }else if(c == n -1){
                    flag = false;
                    r++;
                }else{
                    r--;
                    c++;
                }
            }else{
                /* Note  when moving downwards we are going out of bounds at 
                1: row = last row
                2: first col*/
                if(c == 0 && r != m-1){
                    flag = true;
                    r++;
                }
                else if(r == m-1 && c != n -1 ){
                    flag = true;
                    c++;
                }else{
                    r++;
                    c--;
                }                
            }
        }

        return result;
        
    }
}