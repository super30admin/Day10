// Time Complexity : cO(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: we will have 4 pointers left, right, bottom,
// and top to keep track of our boundaries. And once we add all the elements we move the respective
//top/bottom/left/right

// Your code here along with comments explaining your approach


import java.util.*;
/**
 * SpiralMatrix : SpiralMatrix
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 06, 2024)
 * @since : 1.0 (Nov 06, 2024)
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n= matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = m -1, right = n-1, left = 0;
        while(top <= bottom && left <= right){
            if(top <= bottom && left <= right){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
