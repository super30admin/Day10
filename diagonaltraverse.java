// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length; //Calculate the row
        int col = mat[0].length; //Calculate the column
        int length  = row*col; //Length is row*col

        int[] result = new int[length];
        boolean dir = true; //The direction is forward
        int r = 0;
        int c = 0;

        for(int i = 0; i < length; i++){
            result[i] = mat[r][c];
            if(dir){
                if(r == 0 && c != col - 1){ //If the pointer is at the first row and not at the end column
                    c++;
                    dir = false; //The dir is backward
                }
                else if(c == col - 1){ //If the pointer is at the end of the col
                    r ++;
                    dir = false; //The dir is backward
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if (c == 0 && r != row - 1){ //Continue with the dir as forward if the elem is in the middle
                    r++;
                    dir = true;
                } else if(r == row - 1){ //Or when the pointer is at the end of the row
                    c++;
                    dir = true;
                } else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}