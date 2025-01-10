// Time Complexity : o(M*N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// We maintain a direction to ensure we know when to modify row and col. We handle case for when at start or end of row/colu

// Your code here along with comments explaining your approach
import java.util.Arrays;

class DiagonalArray {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length==0){
            return new int [] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int index=0;
        int row=0, col=0, dir=1;
        while(index<m*n){
            result[index]=mat[row][col];
            index++;
            if(dir==1){
                if(col==n-1){
                    dir=-1;
                    row++;
                } else if(row == 0){
                    dir=-1;
                    col++;
                } else{
                    row--;
                    col++;
                }
            } else {
                if(row==m-1){
                    dir=1;
                    col++;
                } else if(col == 0){
                    dir=1;
                    row++;
                } else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(new DiagonalArray().findDiagonalOrder(mat)));
    }
}