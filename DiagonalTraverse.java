// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/diagonal-traverse/submissions/1048783847/
// Three line explanation of solution in plain english
/*
* Maintain the directions, bottom to top and top to bottom
* Loop till index < m*n ; Check the extreme conditions when row/col ==0 or  row/col == m-1/n-1
* Add the elements throughout the loop, return the result
 */
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int dir=1;
        int r=0, c=0;
        int result[] = new int[m*n];
        while(index < m*n){
            result[index] = mat[r][c];
            index++;
            if(dir ==1){
                if(c==n-1){
                    dir =-1;
                    r++;
                }
                else if(r==0){
                    dir=-1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    dir =1;
                    c++;
                }
                else if(c==0){
                    dir=1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}