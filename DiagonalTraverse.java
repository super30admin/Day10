// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// Keep the check of direction and row and col.
// for dir == 1 : If traversal reaches end of column increase row and when if it reaches top row increase col else decrease row and increase col
// for dir == -1 : If traversal reaches end of row increase col and when if it reaches first col increase row else decrease col and increase row


public class DiagonalTraverse {

        public int[] findDiagonalOrder(int[][] mat) {
            if(mat == null || mat.length ==0){
                return null;
            }
            int n = mat.length;
            int m = mat[0].length;
            int dir =1, row =0, col =0;
            int[] result  = new int[m*n];

            for(int index=0;index< result.length;index++){
                result[index] = mat[row][col];
                if(dir == 1){
                    if(col == m-1){
                        row++;
                        dir = -1;
                    }else if(row == 0){
                        col++;
                        dir = -1;
                    }else{
                        row--;
                        col++;
                    }
                }else if(dir == -1){
                    if(row == n-1){
                        col++;
                        dir =1;
                    }else if(col == 0){
                        row++;
                        dir =1;
                    }else{
                        row++;
                        col--;
                    }
                }

            }
            return result;
        }

}
