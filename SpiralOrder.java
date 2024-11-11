// Time Complexity :O(m*n) n is number of elements in array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        List<Integer> res= new ArrayList<>();

        int top=0, left=0, right=n-1, bottom= m-1;

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top<= bottom){
                for(int i=right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String args[]) {
        SpiralOrder prob2 = new SpiralOrder();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Output "+prob2.spiralOrder(matrix));
    }
}
