public class TwoDDiagonal {

    class Solution {
        //Time complexity: O(m*n)
        //Space complexity: O(1)
        public int[] findDiagonalOrder(int[][] mat) {
            
            int [] res = new int [mat.length*mat[0].length];
            int n = mat.length;
            int m = mat[0].length;
           int direction = 1;
           int index =0;
           int row = 0;
           int column = 0;
           while (index < res.length) {
            if (direction ==1){
                if (column == m){
                    
                    row= row+2;
                    column--;
                    
                    direction--;
                } else if (row < 0){
                    row = 0;
                    direction--;
                } else {
                    res[index] = mat[row][column];
                    index++;
                    row--;
                    column++;
                }
            } else {
                if (row == n){
                    row --;
                    column = column+2;
                    direction++;
                } else if (column <0){
                    column =0;
                    direction++;
                } else {
                    res[index] = mat[row][column];
                    index++;
                    row++;
                    column--;
                }
            }
           }
           return res;
        }
    }
}
