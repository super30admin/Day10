// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach

//for accessing 2*2 matrix we need i, j thus, here we are manipulating i, j in such a way that 
//the direction is maintained and changed and elemnts are accessed diagonally. logic for that
//is commented in the code by me.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean direction = true; // true for upwards and false for downwards
        int m = mat.length;
        int n= mat[0].length;
        int[] result = new int[m*n];
        int i= 0;
        int j=0;
        int index = 0;
        while(i!=m-1 ||  j!=n-1){
            result[index]= mat[i][j];
            index++;
            //upwards
            if(direction == true){
                if(j==n-1){
                    // we are at last column
                    i++; direction = false;
                }else if(i==0){
                    //we are in first row cant go anymore up
                    j++; direction =false;

                }else {i--; j++;} //case - to go upwards
            }
            //downwards
            else{
                if(i==m-1){
                    j++; direction = true;
                    // we are inlast row, cant go anymore down
                }else if(j==0){
                    i++; direction = true;
                }else {i++; j--; }//case - to go down
            }
        }
        result[index]= mat[i][j];
        return result;
    }
}