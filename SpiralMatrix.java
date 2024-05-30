//Time Complexity - O(m * n)
//Space Complexity - O(1)
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null){
            return new ArrayList<>();
        }
        List<Integer> resultList = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int left = 0;
        int right = n-1;
        int top = 0; 
        int bottom = m - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                resultList.add(matrix[top][j]);
            }
            top++;
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    resultList.add(matrix[i][right]);
                }
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    resultList.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    resultList.add(matrix[i][left]);
                }
            }
            left++;

        }
     return resultList;   
    }
}
