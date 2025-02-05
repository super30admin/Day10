// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
//accessing every element by handling i,j by motions in every direction and changing the value
// of accessed element to 200 to avoid repeatation ==> direction logic in code.


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int dir = 0;
        for(int index=0; index<m*n; index++){
            result.add(matrix[i][j]);
            matrix[i][j] = 200;
            //right direction dir-0
            if(dir==0){
                if(j==n-1 || matrix[i][j+1] == 200){
                    // if at first row rightmost or left to element that was accessed while going down
                    dir = 3;
                    i++;
                }else{
                    j++;
                }
            }else if(dir==1){
                //left
                if(j==0 || matrix[i][j-1]==200){
                     // if at last row leftmost or right to element that was accessed while going up
                    dir = 2;
                    i--;
                }
                else{
                    j--;
                }
            }else if(dir==2){
                //up
                if(i==0||matrix[i-1][j]==200){
                     // if at first row topmost or below of element that was accessed while going right
                    dir = 0;
                    j++;
                }else{
                    i--;
                }
            }else{
                //down
                if(i==m-1||matrix[i+1][j]==200){
                     // if at last row downmost or above the element that was accessed while going left
                    dir = 1;
                    j--;
                }else{
                    i++;
                }
            }
        }
        return result;
    }
}