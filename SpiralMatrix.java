//Time Complexity:O(m*n)
//Space Complexity:O(m*n)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        while(left<=right && top <=bottom) {
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right col
            if(left<=right && top <=bottom){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            //bottom row
            if(left<=right){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SpiralMatrix matrix=new SpiralMatrix();
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        List<Integer> result=matrix.spiralMatrix(mat);
        System.out.println(result);
    }
}
