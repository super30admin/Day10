/**
 * There are 2 directions of traversal.
 *  while moving up --> row-- and col++
 *  while moving down --> row++ and col--
 *  handle the edge cases.
 * Leetcode : 498
 * 
 * Time Complexity:O(m*n)
 * Space Complexity:O(1)
 * 
 */

public class DiagnalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        int dir  = 1;
        int[] result = new int[m*n];
        int indx=0;
        while(row<m && col<n){
            result[indx++]=mat[row][col];
            if(dir ==1){
                if(col==n-1){
                    row++;
                    dir=-1;
                }else if(row == 0){
                    col++;
                    dir=-1;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m-1){
                    col++;
                    dir=1;
                }else if(col==0){
                    row++;
                    dir=1;
                }else{
                    row++;
                    col--;
                }
            }
        }
        
    return result;
    }
}
